import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_062020_Codeforces_Round651_Div2_B 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		tests: for(int i=0; i<T; i++)
		{
			int n = Integer.parseInt(in.readLine());
			if(n==1)
			{
				System.out.println("FastestFinger");
				continue tests;
			}
			if(n==2)
			{
				System.out.println("Ashishgup");
				continue tests;
			}
			if(n%2==1)
			{
				System.out.println("Ashishgup");
				continue tests;
			}
			else
			{
				if(isPowerOfTwo(n))
				{
					System.out.println("FastestFinger");
					continue tests;
				}
				else
				{
					int remainingN = n/getFirstOddDivisor(n);
					if(remainingN == 2)
					{
						System.out.println("FastestFinger");
						continue tests;
					}
					else
					{
						System.out.println("Ashishgup");
						continue tests;
					}
				}
			}
		}
	}

	public static boolean isPowerOfTwo(int x) 
	{ 
		return x != 0 && ((x & (x - 1)) == 0); 
	}

	public static int getFirstOddDivisor(int x) 
	{ 
		while(x>=1)
		{
			x = x/2;
			if(x%2==1)
				return x;
		}
		return 1;
	}
}
