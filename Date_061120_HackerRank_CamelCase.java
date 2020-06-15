import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061120_HackerRank_CamelCase 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();

		int len = input.length();
		int countOfWords = 0;
		for(int i=0; i<len; i++)
		{
			int ascii = (int)input.charAt(i);
			if( ascii >=65 && ascii <=90 )
				countOfWords++;
		}
		System.out.println(countOfWords+1);
	}
}
