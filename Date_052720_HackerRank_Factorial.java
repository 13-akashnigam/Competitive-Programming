import java.math.BigInteger;
import java.util.Scanner;

public class Date_052720_HackerRank_Factorial 
{
	static void extraLongFactorials(int n) 
	{
		BigInteger bigInteger = new BigInteger("1");
		for(long i=n; i>1; i--)
			bigInteger = bigInteger.multiply(new BigInteger(""+i+"".trim()));
		System.out.println(bigInteger);
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        extraLongFactorials(n);
        scanner.close();
    }
}
