import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Date_052920_HackerRank_ElectronicsShop 
{
	static int getMoneySpent(int[] keyboards, int[] drives, int b) 
	{
		int keyboardCount = keyboards.length;
		int drivesCount = drives.length;

		int keyboardCost=0;
		int drivesCost=0;

		int minnimumDifferenceFromBudget = Integer.MAX_VALUE;
		for(int i=0; i<keyboardCount; i++)
		{
			for(int j=0; j<drivesCount; j++)
			{
				int cost = keyboards[i] + drives[j];
				if(cost > b)
					continue;
				if(Math.abs(cost-b) < minnimumDifferenceFromBudget)
				{
					minnimumDifferenceFromBudget = Math.abs(cost-b);
					keyboardCost = keyboards[i];
					drivesCost = drives[j];
				}
			}
		}
		if(keyboardCost+drivesCost==0)
			return -1;
		return keyboardCost+drivesCost;
	}


	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] bnm = in.readLine().split(" ");

		int b = Integer.parseInt(bnm[0]);

		int n = Integer.parseInt(bnm[1]);

		int m = Integer.parseInt(bnm[2]);

		int[] keyboards = new int[n];

		String[] keyboardsItems = in.readLine().split(" ");

		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
			keyboards[keyboardsItr] = keyboardsItem;
		}

		int[] drives = new int[m];

		String[] drivesItems = in.readLine().split(" ");

		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
			drives[drivesItr] = drivesItem;
		}

		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, b);

		bufferedWriter.write(String.valueOf(moneySpent));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}
}
