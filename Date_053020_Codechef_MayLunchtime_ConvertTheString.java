import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Date_053020_Codechef_MayLunchtime_ConvertTheString 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of tests");
		int t = Integer.parseInt(in.readLine());
		outer: for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the length of the string");
			int len = Integer.parseInt(in.readLine());
			
			//System.out.println("Enter the first string");
			String A = in.readLine();
			
			//System.out.println("Enter the second string");
			String B = in.readLine();
	
			for(int j=0; j<len; j++)
			{
				if(!A.contains(B.substring(j, j+1)))
				{
					System.out.println("-1");
					continue outer;
				}
			}

			StringBuffer A1 = new StringBuffer(A);
			StringBuffer B1 = new StringBuffer(B);

			char firstString[] = A.toCharArray();
			char secondString[] = B.toCharArray();

			List<Integer> output = new ArrayList<>();
			int numberOfOperations = 0;
			for(int j=0; j<len; j++)
			{
				//char a = firstString[j];
				char a = A1.charAt(j);
				char b = B1.charAt(j);
				int flag1 = 0;
				if(a == b)
					continue;
				else
				{
					if((int)a < (int)b)
					{
						System.out.println("-1");
						continue outer;
					}
					else
					{
						numberOfOperations++;
						output.add(A.indexOf(b));
						output.add(j);
						A1.setCharAt(j, b);
						A = A1.toString();
					}
				}
			}
			System.out.println(numberOfOperations);
			for(int ii=0; ii<numberOfOperations*2; ii+=2)
				System.out.println("2 "+output.get(ii)+" "+output.get(ii+1));
		}
	}
}
