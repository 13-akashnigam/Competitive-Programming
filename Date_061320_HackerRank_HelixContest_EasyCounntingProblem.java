import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Date_061320_HackerRank_HelixContest_EasyCounntingProblem {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());

		tests: for(int i=0; i<t; i++)
		{
			String input[] = in.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			int A = Math.max(a, b);
			int B = Math.min(a, b);
			
			if(B==0 && A==1)
			{
				System.out.println("1");
				continue tests;
			}
			
			if(B==0 && A>1)
			{
				System.out.println("0");
				continue tests;
			}
			
			if(A>(B+1))
			{
				System.out.println("0");
				continue tests;
			}
			
			if(A==(B+1))
			{
				System.out.println(factorial(new BigInteger(""+A)).multiply(new BigInteger(""+B).mod(new BigInteger(""+1000000007))));
				continue tests;
			}
		
			if(A==B)
			{
				System.out.println(factorial(new BigInteger(""+A)).multiply(new BigInteger(""+B).multiply(new BigInteger("2")).mod(new BigInteger(""+1000000007))));
				continue tests;
			}

			/*BigInteger n1 = new BigInteger(""+a);
			BigInteger n2 = new BigInteger(""+b);

			BigInteger numerator = factorial(n1).multiply(factorial(n2));
			
			System.out.println(numerator.mod(new BigInteger(""+1000000007)));*/
		}

	}

	public static BigInteger factorial(BigInteger number) 
	{
		BigInteger result = BigInteger.valueOf(1);

		for (long factor = 2; factor <= number.longValue(); factor++) {
			result = result.multiply(BigInteger.valueOf(factor));
		}
		return result;
	} 

}
