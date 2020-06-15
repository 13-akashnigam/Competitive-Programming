import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061320_HackerRank_HelixContest_MissingNNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());

		for(int i=0; i<t; i++)
		{
			String input[] = in.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			int p = Integer.parseInt(input[3]);
			int q = Integer.parseInt(input[4]);

			if(a!=p && a!=q)
				System.out.println(a);
			if(b!=p && b!=q)
				System.out.println(b);
			if(c!=p && c!=q)
				System.out.println(c);
		}
	}
}
