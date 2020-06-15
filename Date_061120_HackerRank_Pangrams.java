import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_061120_HackerRank_Pangrams 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine().toUpperCase();
		int len = s.length();

		if(len<26)
		{
			System.out.println("not pangram");
			return;
		}

		int a[] = new int[26];
		Arrays.fill(a, 0);

		for(int i=0; i<len; i++)
		{
			char ch = s.charAt(i);
			int ascii = (int)ch;
			if(ascii>=65 && ascii<=91)
				a[ascii-65]++; 
		}

		for(int i=0; i<26; i++)
		{
			if(a[i] == 0)
			{
				System.out.println("not pangram");
				return;
			}
		}
		System.out.println("pangram");
	}
}
