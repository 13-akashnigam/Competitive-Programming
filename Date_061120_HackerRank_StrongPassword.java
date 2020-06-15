import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061120_HackerRank_StrongPassword 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String s = in.readLine();

		int digits = 0;
		int lowerCase = 0;
		int upperCase = 0;
		int special = 0;

		for(int i=0; i<n; i++)
		{
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
				lowerCase++;
			else if(Character.isUpperCase(ch))
				upperCase++;
			else if(Character.isDigit(ch))
				digits++;
			else
				special++;
		}

		/*System.out.println("digits = "+digits);
		System.out.println("lowerCase = "+lowerCase);
		System.out.println("upperCase = "+upperCase);
		System.out.println("special = "+special);*/
		int charsToBeAdded = 0;

		if(lowerCase == 0)
			charsToBeAdded++;
		if(upperCase == 0)
			charsToBeAdded++;
		if(digits == 0)
			charsToBeAdded++;
		if(special == 0)
			charsToBeAdded++;

		//System.out.println("charsToBeAdded = "+charsToBeAdded);

		if(n+charsToBeAdded < 6)
			System.out.println(charsToBeAdded+(6-(n+charsToBeAdded)));
		else
			System.out.println(charsToBeAdded);
	}
}
