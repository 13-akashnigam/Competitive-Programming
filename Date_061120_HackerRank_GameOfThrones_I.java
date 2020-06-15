import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_061120_HackerRank_GameOfThrones_I 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		int len = s.length();
		char chars[] = s.toCharArray();

		Arrays.sort(chars);

		//System.out.println(Arrays.toString(chars));

		if(chars[0] == chars[len-1])
		{
			System.out.println("YES");
			return;
		}

		int firstLeftPointer = 0;
		int secondLeftPointer = 0;
		int countOfCharsWithOddOccurence = 0;
		int countOfCharsWithEvenOccurence = 0;
		int countOfCurrentChar = 0;

		while(secondLeftPointer<len)
		{
			char currentChar = chars[firstLeftPointer];
			while(currentChar == chars[secondLeftPointer])
			{
				secondLeftPointer++;
				if(secondLeftPointer==len)
					break;
			}

			countOfCurrentChar = secondLeftPointer - firstLeftPointer;
			//System.out.println("Current char = "+currentChar+" count ="+countOfCurrentChar);
			firstLeftPointer = secondLeftPointer;

			if(countOfCurrentChar%2 == 0)
				countOfCharsWithEvenOccurence++;
			else
				countOfCharsWithOddOccurence++;
			if(countOfCharsWithOddOccurence>1)
			{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
