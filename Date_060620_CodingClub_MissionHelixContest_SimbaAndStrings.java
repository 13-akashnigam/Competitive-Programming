import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060620_CodingClub_MissionHelixContest_SimbaAndStrings {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the number of strings");
		long N = Long.parseLong(in.readLine());
		tests: for(long i=0; i<N; i++)
		{
			//System.out.println("Enter the string");
			String input = in.readLine();
			int len = input.length();

			char ch = input.charAt(0);
			if(ch=='a')
			{
				int leftPointer = 0;
				while(leftPointer < len)
				{
					if(input.charAt(leftPointer) == 'a')
					{
						leftPointer++;
						continue;
					}
					if(leftPointer==len)
					{
						System.out.println("No");
						continue tests;
					}
					else
					{
						if(input.charAt(leftPointer)!='b')
						{
							System.out.println("No");
							continue tests;
						}
						else
						{
							while(input.charAt(leftPointer) == 'b')
							{
								leftPointer++;
								if(leftPointer==len)
									break;
								continue;
							}
							if(leftPointer==len)
							{
								System.out.println("Yes");
								continue tests;
							}
							else
							{
								System.out.println("No");
								continue tests;
							}
						}
					}
				}
				System.out.println("No");

			}
			else
				System.out.println("No");
		}

	}

}
