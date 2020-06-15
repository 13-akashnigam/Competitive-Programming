import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060520_Codechef_JuneLongChallenge_ChefAndPriceControl 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the number of tests");
		long t = Integer.parseInt(in.readLine());

		for(long i=0; i<t; i++)
		{
			//System.out.println("Enter number of items and max price allowed");
			String inputLine1[] = in.readLine().split(" ");
			long items = Long.parseLong(inputLine1[0]);
			long maxPrice = Long.parseLong(inputLine1[1]);

			//System.out.println("Enter the price of items");
			String inputLine2[] = in.readLine().split(" ");

			long amountLost = 0;
			for(int j=0; j<items; j++)
			{
				long itemPrice = Long.parseLong(inputLine2[j]);
				if(itemPrice > maxPrice)
					amountLost = amountLost + (itemPrice-maxPrice);
			}
			System.out.println(amountLost);
		}
	}
}
