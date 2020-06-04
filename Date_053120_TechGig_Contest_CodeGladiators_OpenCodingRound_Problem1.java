import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Date_053120_TechGig_Contest_CodeGladiators_OpenCodingRound_Problem1 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the number of ingredients required to create powerpuff girls");
		int N = Integer.parseInt(in.readLine());

		//System.out.println("Enter the quantity of each ingredient required to create PP girls");
		String requiredQuantity[] = in.readLine().split(" ");

		//System.out.println("Enter the quantity of each ingredient available in the laboratory");
		String availableQuantity[] = in.readLine().split(" ");

		long created[] = new long[N];

		for(int i=0; i<N; i++)
		{
			created[i] = Long.parseLong(availableQuantity[i])/Long.parseLong(requiredQuantity[i]);
		}

		Arrays.sort(created);
		System.out.println(created[0]);
	}
}
