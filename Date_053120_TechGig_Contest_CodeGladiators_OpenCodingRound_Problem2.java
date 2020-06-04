import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_053120_TechGig_Contest_CodeGladiators_OpenCodingRound_Problem2 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of test cases");
		int T = Integer.parseInt(in.readLine());

		for(int i=0; i<T; i++)
		{
			//System.out.println("Enter the number of members in the team");
			int N = Integer.parseInt(in.readLine());

			//System.out.println("Enter the power of members of your team");
			String yourTeamPower[] = in.readLine().split(" ");

			//System.out.println("Enter the power of members of opponents team");
			String opponentTeamPower[] = in.readLine().split(" ");

			long yourMembersPower[] =  new long[N];
			long opponentMembersPower[] =  new long[N];

			for(int j=0; j<N; j++)
			{
				yourMembersPower[j] = Long.parseLong(yourTeamPower[j]);
				opponentMembersPower[j] = Long.parseLong(opponentTeamPower[j]);
			}

			Arrays.sort(yourMembersPower);
			Arrays.sort(opponentMembersPower);
			//System.out.println("After sorting:");
			//System.out.println(Arrays.toString(yourMembersPower));
			//System.out.println(Arrays.toString(opponentMembersPower));

			int countOfWins = 0;
			for(int k=0; k<N; k++)
			{
				long powerOfOpponentTeamMember = opponentMembersPower[k];

				for(int l=0; l<N; l++)
				{
					if(yourMembersPower[l] > powerOfOpponentTeamMember)
					{
						yourMembersPower[l] = -1;
						countOfWins++;
						break;
					}
				}
				//System.out.println("After pass: "+k);
				//System.out.println(Arrays.toString(yourMembersPower));
			}
			System.out.println(countOfWins);
		}
	}
}

//https://www.techgig.com/codegladiators/result/ZlFHbUttamFkeWFnTjRmRG9leGVaQT09
