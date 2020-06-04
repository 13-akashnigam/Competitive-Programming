import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_053020_Codechef_MayLunchtime_LostWeekends 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of tests");
		int t = Integer.parseInt(in.readLine());
		for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the number of office work hours needed Mon - Fri and WFH:WFO ratio");
			String input = in.readLine();
			String inputArray[] = input.split(" ");
			int officeHoursOnMonday = Integer.parseInt(inputArray[0]);
			int officeHoursOnTuesday = Integer.parseInt(inputArray[1]);
			int officeHoursOnWednesday = Integer.parseInt(inputArray[2]);
			int officeHoursOnThursday = Integer.parseInt(inputArray[3]);
			int officeHoursOnFriday = Integer.parseInt(inputArray[4]);
			
			int ratio = Integer.parseInt(inputArray[5]);
			
			int homeHoursOnMonday = officeHoursOnMonday * ratio;
			int homeHoursOnTuesday = officeHoursOnTuesday * ratio;
			int homeHoursOnWednesday = officeHoursOnWednesday * ratio;
			int homeHoursOnThursday = officeHoursOnThursday * ratio;
			int homeHoursOnFriday = officeHoursOnFriday * ratio;
			
			int sumOfWFHHours = homeHoursOnMonday + homeHoursOnTuesday + homeHoursOnWednesday + homeHoursOnThursday + homeHoursOnFriday; 
			
			if(sumOfWFHHours > 120)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
