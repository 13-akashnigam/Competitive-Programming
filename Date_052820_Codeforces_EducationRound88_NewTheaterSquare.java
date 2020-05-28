import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_052820_Codeforces_EducationRound88_NewTheaterSquare 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of test cases");
		int t = Integer.parseInt(in.readLine());
		
		for(int ii=0; ii<t; ii++)
		{
			//System.out.println("Enter the number of rows, number of columns, cost of 1X1 and cost of 1X2");
			String input = in.readLine();
			String inputArray[] = input.split(" ");
			int rows = Integer.parseInt(inputArray[0]);
			int cols = Integer.parseInt(inputArray[1]);
			int cost1by1 = Integer.parseInt(inputArray[2]);
			int cost1by2 = Integer.parseInt(inputArray[3]);
			
			char config[][] = new char[rows][cols];
			int totalCountOfWhite1by1Space = 0;
			for(int i=0; i<rows; i++)
			{
				//System.out.println("Enter the configuration of row number "+(i+1));
				String configuration = in.readLine();
				for(int j=0; j<cols; j++)
				{
					config[i][j] = configuration.charAt(j);
					if(configuration.charAt(j) == '.')
						totalCountOfWhite1by1Space++;
				}
			}
			
			int totalCostOfUsingOnly1by1Tiles = totalCountOfWhite1by1Space * cost1by1;
			
			int totalCostOfUsingBothTiles = 0;
			for(int i=0; i<rows; i++)
			{
				for(int j=0; j<cols; j++)
				{
					if(config[i][j] == '.' && j+1<cols)
					{
						if(config[i][j+1]=='.')
						{
							totalCostOfUsingBothTiles = totalCostOfUsingBothTiles + cost1by2;
							config[i][j] = 'P';
							config[i][j+1] = 'P';
						}
						else
						{	
							totalCostOfUsingBothTiles = totalCostOfUsingBothTiles + cost1by1;
							config[i][j] = 'P';
						}	
					}
					else if(config[i][j] == 'P')
						continue;
					else if(config[i][j] == '.' && j+1>=cols)
					{
						totalCostOfUsingBothTiles = totalCostOfUsingBothTiles + cost1by1;
						config[i][j] = 'P';
					}
					else  // if character is *
					{
						continue;
					}
				}
			}
			if(totalCostOfUsingOnly1by1Tiles < totalCostOfUsingBothTiles && totalCostOfUsingOnly1by1Tiles!=0)
				System.out.println(totalCostOfUsingOnly1by1Tiles);
			else
				System.out.println(totalCostOfUsingBothTiles);	
		}
	}
}
