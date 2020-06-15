import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061120_HackerRank_HackerRankInAString 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(in.readLine());

		for(int i=0; i<q; i++)
		{
			String s = in.readLine();
			int len = s.length();

			String comparator = "hackerrank";

			int cPointer = 0;
			int sPointer = 0;
			int found = 0;


			while(sPointer < len && cPointer < 10)
			{
				char cChar = comparator.charAt(cPointer);
				char sChar = s.charAt(sPointer);
				if(sChar == cChar)
				{
					found++;
					cPointer++;
				}
				sPointer++;
			}
			//System.out.println("found = "+found);
			if(found == 10)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
