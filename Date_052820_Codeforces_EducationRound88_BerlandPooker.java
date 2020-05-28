import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_052820_Codeforces_EducationRound88_BerlandPooker 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of test cases");
		int t = Integer.parseInt(in.readLine());
		
		for(int ii=0; ii<t; ii++)
		{
			//System.out.println("Enter the number of cards, number of jokers and number of players");
			String input = in.readLine();
			String inputArray[] = input.split(" ");
			int noOfCards = Integer.parseInt(inputArray[0]);
			int noOfJokers = Integer.parseInt(inputArray[1]);
			int noOfPlayers = Integer.parseInt(inputArray[2]);
			
			int cardsWithEachPlayer = noOfCards/noOfPlayers;
			
			if(noOfJokers <= cardsWithEachPlayer)
				System.out.println(noOfJokers);
			else
			{
				int players[] = new int[noOfPlayers];
				players[0] = cardsWithEachPlayer;
				for(int k=1; k<noOfPlayers; k++)
					players[k] = 0;
				
				int noOfJokersRemaining = noOfJokers - players[0];
				
				while(noOfJokersRemaining!=0)
				{
					for(int j=1; j<noOfPlayers; j++)
					{
						players[j] = players[j] + 1;
						noOfJokersRemaining = noOfJokersRemaining - 1;
						if(noOfJokersRemaining == 0)
							break;
					}
				}
				System.out.println(players[0] - players[1]);
			}	
		}
	}
}
