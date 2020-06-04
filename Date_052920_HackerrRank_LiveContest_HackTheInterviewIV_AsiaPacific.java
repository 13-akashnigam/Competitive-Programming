import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_052920_HackerrRank_LiveContest_HackTheInterviewIV_AsiaPacific 
{
	public static int minimumMoves(String s, int d) 
	{
		int len = s.length();
		char inputArray[] = s.toCharArray();
		int updatesDone = 0;
		
		for(int i=0; i<=len-d; i++)
		{
			int countOf1 = 0;
			int j;
			for(j=i; j<i+d; j++)
			{
				if(inputArray[j]=='1')
				{
					countOf1++;
					break;
				}
			}
			if(countOf1==0)
			{
				inputArray[j-1] = '1';
				updatesDone++;
			}
		}
		return updatesDone;
	}
	
	public static int minimumMoves1(String s, int d) 
	{
		int len = s.length();
		char inputArray[] = s.toCharArray();
		
		for(int i=0; i<len; i++)
		{
			if(inputArray[i] == '1')
			{
				for(int j=i-1; j>i-d && j>=0; j--)
				{
					if(inputArray[j] == '0')
						inputArray[j] = 'X';
				}
				for(int k=i+1; k<i+d && k<len; k++)
				{
					if(inputArray[k] == '0')
						inputArray[k] = 'X';
				}
			}
		}
		
		System.out.println("Array after removing the zeroes covered: "+Arrays.toString(inputArray));
		
		int start = 0;
		int flipsNeeded = 0;
		for(int x=0; x<len; x++)
		{
			if(inputArray[x] == '0')
			{
				start = x;
				int end = start;
				int countOfContinousZeroes = 0;
				while(inputArray[end] == '0')
				{
					countOfContinousZeroes++;
					end++;
					if(end>=len)
						break;
				}
				if(countOfContinousZeroes%(2*d-1) == 0)
					flipsNeeded = flipsNeeded + (countOfContinousZeroes/(2*d-1));
				else
					flipsNeeded = flipsNeeded + (countOfContinousZeroes/(2*d-1)) + 1;
				x=end;
			}
		}
		return flipsNeeded;
	}
	
	public static void main(String[] args) throws IOException 
	{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int d = Integer.parseInt(bufferedReader.readLine().trim());
        int result = minimumMoves1(s, d);
        System.out.println(String.valueOf(result));
        bufferedReader.close();
    }
}
