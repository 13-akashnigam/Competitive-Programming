import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_061620_Codeforces_Round650_Div3_C 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		tests: for(int i=0; i<T; i++)
		{
			String input[] = in.readLine().split(" ");
			int len = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);

			String s = in.readLine();
			char cc[] = s.toCharArray();

			//System.out.println(Arrays.toString(cc));

			int countOf0 = 0;
			int countOf11 = 0;
			for(int rr=0; rr<len; rr++)
			{
				if(cc[rr] == '0')
					countOf0++;
				if(cc[rr] == '1')
					countOf11++;
			}

			if(countOf11 == len)
			{
				System.out.println("0");
				continue tests;
			}
			
			//System.out.println("countOf0 ="+countOf0);
			if(countOf0 == len)
			{
				/*if(k+1>=len)
				{
					System.out.println("1");
					continue tests;
				}
				else
				{
					System.out.println((int)Math.ceil((double)len/(double)(k+1)));
					continue tests;
				}*/
				int countOf1 = 0;
				for(int ff=0; ff<len; ff+=(k+1))
				{
					countOf1++;
				}
				System.out.println(countOf1);
				continue tests;
			}

			for(int j=0; j<len; j++)
			{
				if(cc[j] == '1')
				{
					int j2;
					for(j2=j-1; j2>=j-k && j2>=0; j2--)
					{
						cc[j2] = 'X';
					}
				}


				if(cc[j] == '1')
				{
					int j1;
					for(j1=j+1; j1<=j+k && j1<len; j1++)
					{
						cc[j1] = 'X';
					}
					j=j1-1;
				}
			}

			//System.out.println(Arrays.toString(cc));
			
			int available = 0;
			for(int tt=0; tt<len; tt++)
			{
				int countOfConsecutive0s = 0;
				if(cc[tt] == '0')
				{
					while(tt<len && cc[tt] == '0')
					{
						countOfConsecutive0s++;
						tt++;
					}
					//System.out.println("countOfConsecutive0s = "+countOfConsecutive0s);
					available = available + (int)Math.ceil((double)countOfConsecutive0s/(double)(k+1));
					//System.out.println("available ="+available);
				}
			}
			
			System.out.println(available);

			
			/*for(int x=0; x<len; x++)
			{
				if(cc[x] == '0')
					available++;
			}
			System.out.println(available);*/
		}
	}
}
