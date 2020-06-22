import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_062020_Codeforces_Round651_Div2_A 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		tests: for(int i=0; i<T; i++)
		{
			int n = Integer.parseInt(in.readLine());
			if(n%2==0)
			{
				System.out.println(n/2);
				continue tests;
			}
			else
			{
				n = n - 1;
				System.out.println(n/2);
				continue tests;
			}
		}
	}
}
