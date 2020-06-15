import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_060420_Codeforces_Round647_C 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of tests");
		long t = Long.parseLong(in.readLine());

		outermost: for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the value of n");
			long n = Long.parseLong(in.readLine());
			
			int diff = 0;
			for(long i1=0; i1<n; i1++)
			{
				String binRep1 = Long.toBinaryString(i1);
				String binRep2 = Long.toBinaryString(i1+1);
				//System.out.println("Binary rep of : "+i1+" = "+binRep1);
				//System.out.println("Binary rep of : "+(i1+1)+" = "+binRep2);
				
				int len1 = binRep1.length();
				int len2 = binRep2.length();
				
				int greaterLen = 0;
				if(len1 > len2)
					greaterLen = len1;
				else
					greaterLen = len2;
				
				//System.out.println("greaterLen = "+greaterLen);
				
				char a1[] = new char[greaterLen];
				char a2[] = new char[greaterLen];
				Arrays.fill(a1, '0');
				Arrays.fill(a2, '0');
				
				//System.out.println("A1 after filling 0s = "+Arrays.toString(a1));
				//System.out.println("A2 after filling 0s = "+Arrays.toString(a2));
				
				int p1 = a1.length-1;
				for(int p = binRep1.length()-1; p>=0; p--)
				{
					char ch = binRep1.charAt(p);
					a1[p1] = ch;
					p1--;
				}
				
				//System.out.println("A1 after adding bins = "+Arrays.toString(a1));
				
				int p2 = a2.length-1;
				for(int p = binRep2.length()-1; p>=0; p--)
				{
					char ch = binRep2.charAt(p);
					a2[p2] = ch;
					p2--;
				}
				
				//System.out.println("A2 after adding bins = "+Arrays.toString(a2));
				
				for(int x=0; x<greaterLen; x++)
				{
					if(a1[x] != a2[x])
						diff++;
				}
				
				//System.out.println("============================");
			}
			System.out.println(diff);
		}
	}
}
