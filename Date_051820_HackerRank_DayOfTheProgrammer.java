import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_051820_HackerRank_DayOfTheProgrammer 
{
	static String dayOfProgrammer(int year) 
	{
		int jan = 31;
		int feb = getDaysInFeb(year);
		System.out.println("feb = "+feb);
		int mar = 31;
		int apr = 30;
		int may = 31;
		int june = 30;
		int july = 31;
		int aug = 31;
		int countOfDaysTill31Aug = jan + feb + mar + apr + may + june + july + aug;
		System.out.println("countOfDaysTill31Aug = "+countOfDaysTill31Aug);
		int remainingDays = 256 - countOfDaysTill31Aug;
		return ""+remainingDays+".09."+year;
    }
	
	public static int getDaysInFeb(int year)
	{
		int feb;
		if(year<1918)
		{
			if(year%4 == 0)
				feb = 29;
			else
				feb = 28;
		}
		else if(year == 1918)
			feb = 16;
		else
		{
			if(year%400 == 0)
				feb = 29;
			else
			{
				if(year%4 == 0)
				{
					if(year%100 == 0)
						feb = 28;
					else
						feb = 29;
				}
				else
					feb = 28;
			}
		}
		return feb;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine().trim());
        String result = dayOfProgrammer(year);
        System.out.println("result = "+result);
        bufferedReader.close();
	}
}
