import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060420_HackerRank_AngryProfessor 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of tests");
		int t = Integer.parseInt(in.readLine());

		for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the total number of students and the number of students needed for class to continue");
			String inputLine1[] = in.readLine().split(" ");
			int totalNoOfStudents = Integer.parseInt(inputLine1[0]);
			int countOfStudentsNeededForClassToContinue = Integer.parseInt(inputLine1[1]);

			String inputLine2[] = in.readLine().split(" ");

			int countOfStudentsOnTime = 0;
			for(int j=0; j<totalNoOfStudents; j++)
			{
				if(Integer.parseInt(inputLine2[j]) <= 0)
					countOfStudentsOnTime++;
			}

			if(countOfStudentsOnTime < countOfStudentsNeededForClassToContinue)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
