import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061620_Codeforces_Round650_Div3_A 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for(int i=0; i<T; i++)
		{
			String input = in.readLine();
			int len = input.length();
			char inputArr[] = input.toCharArray();

			String output = ""+inputArr[0]+inputArr[1];
			for(int j=3; j<len; j+=2)
			{
				output = output+inputArr[j];
			}
			System.out.println(output.trim());
		}
	}
}
