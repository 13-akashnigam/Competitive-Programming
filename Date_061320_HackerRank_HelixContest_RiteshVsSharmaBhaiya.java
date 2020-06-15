import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061320_HackerRank_HelixContest_RiteshVsSharmaBhaiya {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());

		tests: for(int i=0; i<t; i++)
		{
			int c = Integer.parseInt(in.readLine());
			loop: for(int j=2; j<c/2; j++)
			{
				if(c%j == 0)
				{
					int firstRoot = j;
					int secondRoot = c/j;
					int sumOfRoots = firstRoot + secondRoot;
					if(((sumOfRoots-1)%2) == 0 && isPrime(firstRoot) && isPrime(secondRoot))
					{
						System.out.println("Valid");
						continue tests;
					}
					else
					{
						continue loop;
					}
				}
			}
			System.out.println("Invalid");
		}

	}
	
	public static boolean isPrime(int n) 
    { 
        // Corner cases 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
  
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    } 

}
