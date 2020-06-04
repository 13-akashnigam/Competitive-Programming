import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_053020_Codechef_MayLunchTime_EsccapeOne 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of tests");
		int t = Integer.parseInt(in.readLine());
		
		for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the number of elements");
			int n = Integer.parseInt(in.readLine());
			//System.out.println("Enter the elements");
			String input = in.readLine();
			String inputArray[] = input.split(" ");
			
			int countOfOperationsNeeded = 0;
			
			for(int j=0; j<n; j++)
			{
				int countOfConsecutive1s = 0;
				int end = 0;
				if(inputArray[j].equals("1"))
				{
					end = j;
					while(inputArray[end].equals("1"))
					{
						countOfConsecutive1s++;
						end++;
						if(end>=n)
							break;
					}
				}
				if(countOfConsecutive1s == 0)
					continue;
				else if(countOfConsecutive1s == 1)
				{
					int k = end;
					while(inputArray[k].equals("0"))
					{
						countOfOperationsNeeded++;
					}
				}
				else if(countOfConsecutive1s > 1)
				{
					j = end-1;
					countOfOperationsNeeded = countOfOperationsNeeded + (countOfConsecutive1s-1);	
				}
			}
			System.out.println(countOfOperationsNeeded);
		}

	}

}
