import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Date_060520_Codechef_JuneLongChallenge_EvenMatrix 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of tests");
		long t = Integer.parseInt(in.readLine());

		for(long i=0; i<t; i++)
		{
			System.out.println("Enter the value of N");
			int n = Integer.parseInt(in.readLine());

			String s="";
			for(int j=1; j<=n*n; j++)
			{
				s = s + j + " ";
				if(j%n == 0)
					s = s + "_";		
			}

			String output[] = s.split("_");

			for(int k=0; k<n; k++)
			{
				if(k%2==1)
				{
					if(n%2==1)
						System.out.println(output[k].trim());
					else
					{
						String odd[] = output[k].trim().split(" ");
						Collections.reverse(Arrays.asList(odd));
						String result="";
						for(int l=0; l<n; l++)
							result = result + odd[l] + " ";
						System.out.println(result.trim());
					}
				}
				else
					System.out.println(output[k].trim());
			}
		}
	}
}
