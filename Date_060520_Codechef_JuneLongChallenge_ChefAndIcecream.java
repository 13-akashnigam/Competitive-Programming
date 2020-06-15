import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060520_Codechef_JuneLongChallenge_ChefAndIcecream 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the number of tests");
		long t = Long.parseLong(in.readLine());
		tests: for(long i=0; i<t; i++)
		{
			//System.out.println("Enter the number of people");
			int n = Integer.parseInt(in.readLine());

			//System.out.println("Enter the note each person pays");
			String inputLine2[] = in.readLine().split(" ");

			int countOf5Notes = 0;
			int countOf10Notes = 0;
			int countOf15Notes = 0;

			int noteReceived[] = new int[n];
			for(int j=0; j<n; j++)
			{
				noteReceived[j] = Integer.parseInt(inputLine2[j]);

				if(noteReceived[j] == 5)
					countOf5Notes++;
				else if(noteReceived[j] == 10)
					countOf10Notes++;
				else
					countOf15Notes++;

				int amountToBeReturned = noteReceived[j] - 5;

				if(amountToBeReturned == 0)
					continue;
				else if(amountToBeReturned == 5)
				{
					if(countOf5Notes==0)
					{
						System.out.println("NO");
						continue tests;
					}
					else
					{
						countOf5Notes--;
						continue;
					}
				}
				else //if(amountToBeReturned == 10)
				{
					if(countOf10Notes==0)
					{
						if(countOf5Notes>=2)
							countOf5Notes-=2;
						else
						{
							System.out.println("NO");
							continue tests;
						}
					}
					else
					{
						countOf10Notes--;
						continue;
					}
				}		
			}
			System.out.println("YES");
		}
	}
}
