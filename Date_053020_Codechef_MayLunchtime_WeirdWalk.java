import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_053020_Codechef_MayLunchtime_WeirdWalk 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of tests");
		int t = Integer.parseInt(in.readLine());
		for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the duration of race in secs");
			long duration = Long.parseLong(in.readLine());
			
			//System.out.println("Enter Alice speed during each second");
			String alice = in.readLine();
			String aliceSpeed[] = alice.split(" ");
			
			//System.out.println("Enter Bob speed during each second");
			String bob = in.readLine();
			String bobSpeed[] = bob.split(" ");
			
			long weirdDistance = 0;
			long distanceCoveredByAlice = 0;
			long distanceCoveredByBob = 0;
			
			for(int j=0; j<duration; j++)
			{
				long prevDistancce = distanceCoveredByAlice;
				if(distanceCoveredByAlice == distanceCoveredByBob)
				{
					distanceCoveredByAlice = distanceCoveredByAlice + Long.parseLong(aliceSpeed[j]);
					distanceCoveredByBob = distanceCoveredByBob + Long.parseLong(bobSpeed[j]);
					
					if(distanceCoveredByAlice == distanceCoveredByBob)
						weirdDistance = weirdDistance + distanceCoveredByAlice - prevDistancce;
				}
				else
				{
					distanceCoveredByAlice = distanceCoveredByAlice + Long.parseLong(aliceSpeed[j]);
					distanceCoveredByBob = distanceCoveredByBob + Long.parseLong(bobSpeed[j]);
				}
			}
			System.out.println(weirdDistance);	
		}
	}

}
