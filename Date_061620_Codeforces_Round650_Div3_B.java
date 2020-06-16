import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061620_Codeforces_Round650_Div3_B 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for(int i=0; i<T; i++)
		{
			int len = Integer.parseInt(in.readLine());
			String input[] = in.readLine().split(" ");

			int evenOutOfPlace = 0;
			int oddOutOfPlace = 0;
			for(int j=0; j<len; j+=2)
			{
				int ele = Integer.parseInt(input[j]);
				if(ele%2 != 0)
					evenOutOfPlace++;
			}

			for(int j=1; j<len; j+=2)
			{
				int ele = Integer.parseInt(input[j]);
				if(ele%2 == 0)
					oddOutOfPlace++;
			}

			if(evenOutOfPlace == oddOutOfPlace)
				System.out.println(evenOutOfPlace);
			else
				System.out.println("-1");
		}
	}
}
