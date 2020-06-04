import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060420_HackerRank_Kangaroo 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException 
	{
		//System.out.println("Enter the starting position of Kangaroo 1, jump size of Kangaroo 1, starting position of Kangaroo 2, jump size of Kangaroo 2");
		String input[] = in.readLine().split(" ");

		int start1 = Integer.parseInt(input[0]);
		int jump1 = Integer.parseInt(input[1]);
		int start2 = Integer.parseInt(input[2]);
		int jump2 = Integer.parseInt(input[3]);

		if(start1==start2)
		{
			if(jump1 == jump2)
			{
				System.out.println("YES");
				return;
			}	
			else
			{
				System.out.println("NO");
				return;
			}
		}
		else if(start1 < start2)
		{
			if(jump1 == jump2)
			{
				System.out.println("NO");
				return;
			}
			else if(jump1 < jump2)
			{
				System.out.println("NO");
				return;
			}
		}
		else // if(start2 < start1)
		{
			if(jump2 == jump1)
			{
				System.out.println("NO");
				return;
			}
			else if(jump2 < jump1)
			{
				System.out.println("NO");
				return;
			}
		}
		//System.out.println("Math.abs(jump2 - jump1) = "+Math.abs(jump2 - jump1));
		//System.out.println("Math.abs(start2 - start1) = "+Math.abs(start2 - start1));
		if(Math.abs(start2 - start1) % (Math.abs(jump2 - jump1)) == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
