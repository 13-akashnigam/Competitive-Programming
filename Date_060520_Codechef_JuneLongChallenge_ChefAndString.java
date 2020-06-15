import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060520_Codechef_JuneLongChallenge_ChefAndString {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the number of tests");
		long t = Long.parseLong(in.readLine());

		for(long i=0; i<t; i++)
		{
			//System.out.println("Enter the string");
			String input = in.readLine();

			long pair = 0;
			long len = input.length();
			for(long j=0; j<len; j++)
			{
				char currentChar = input.charAt((int)j);
				long k = j+1;
				boolean diffFound = true;
				if(k>=len)
					break;
				while(input.charAt((int)k) == currentChar)
				{
					k++;
					if(k==len)
					{
						diffFound = false;
						break;
					}
				}
				if(diffFound)
					pair++;
				j = k;
			}
			System.out.println(pair);
		}
	}

}
