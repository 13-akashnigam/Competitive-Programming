import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date_060720_HackerEarth_FaceToFace 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of tests");
		int T = Integer.parseInt(in.readLine());

		for(int i=0; i<T; i++)
		{
			System.out.println("Enter the string");
			String input = in.readLine();

			char chars[] = input.toCharArray();
			Arrays.sort(chars);

			System.out.println(Arrays.toString(chars));

			List<Integer> countOfChars = new ArrayList<>(); 

			for(int j=0; j<chars.length; j++)
			{
				char currentChar = chars[j];
				int countOfCurrentChar = 0;
				while(chars[j] == currentChar)
				{
					countOfCurrentChar++;
					j++;
					if(j == chars.length)
						break;
					continue;
				}
				System.out.println("Count of "+currentChar+" : "+countOfCurrentChar);
				countOfChars.add(countOfCurrentChar);
				j--;
			}
			System.out.println(countOfChars);

			int countOfCharsWithOddOccurences = 0;
			for(int k=0; k<countOfChars.size(); k++)
			{
				if(countOfChars.get(k)%2==0)
					continue;
				countOfCharsWithOddOccurences++;
			}
			System.out.println("countOfCharsWithOddOccurences = "+countOfCharsWithOddOccurences);
			if(countOfCharsWithOddOccurences == 0 || countOfCharsWithOddOccurences == 1)
				System.out.println("0");
			else
			{
				System.out.println(countOfCharsWithOddOccurences-1);
			}
		}
	}
}
