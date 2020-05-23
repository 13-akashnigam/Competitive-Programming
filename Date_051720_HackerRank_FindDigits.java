/*
 * Platform:- HackerRank
 * Problem:- https://www.hackerrank.com/challenges/find-digits/problem
 * Date:- 05/17/2020
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Date_051720_HackerRank_FindDigits 
{
	public static int findDigits(int n) 
	{
		int input = n;
		int digit;
		int countOfDivisors = 0;
		while(n>0)
		{
			digit = n%10;
			if(digit != 0)
			{
				if(input%digit == 0)
					countOfDivisors++;
			}
			n = n/10;
		}
		return countOfDivisors;
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/ngksh/Documents/output.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) 
        {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int result = findDigits(n);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
	}

}
