import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060520_Codechef_JuneLongChallenge_TomAndJerry 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		for(int i=2; i<=100; i++)
		{
			int j = i;
			int countTillOdd = 0;
			while(j%2 != 1 && j>2)
			{
				j = j / 2;
				countTillOdd++;
			}
			System.out.println(i+" : "+countTillOdd);
				
		}
		
		
		/*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the number of tests");
		long t = Long.parseLong(in.readLine());
		tests: for(long i=0; i<t; i++)
		{
			//System.out.println("Enter the strenght of Tommy");
			long ts = Long.parseLong(in.readLine());
			long tsCopy = ts;

			if(ts <= 2)
			{
				System.out.println(0);
				continue tests;
			}
			if(ts%2 == 1)
			{
				System.out.println(ts/2);
				continue tests;
			}
			else
			{
				int noOfTsDivisionsTillOdd = 0;
				while(tsCopy%2 != 1)
				{
					tsCopy/=2;
					noOfTsDivisionsTillOdd++;
				}
				//System.out.println("noOfTsDivisionsTillOdd = "+noOfTsDivisionsTillOdd);

				int x = (int)(Math.log(ts)/Math.log(2));
				//System.out.println("x ="+x);
				System.out.println(x-noOfTsDivisionsTillOdd);
			}
		}*/
	}
}
