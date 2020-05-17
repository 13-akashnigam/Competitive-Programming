/*
 * Platform:- HackerRank
 * Problem:- https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * Date:- 05/17/2020
 */

import java.util.Arrays;
import java.util.Scanner;

public class Date_051720_HackerRank_BirthdayCakeCandles 
{
	public static int birthdayCakeCandles(int[] ar) 
	{
		Arrays.sort(ar);
		int rightPointer = ar.length-1;
		int largestCandle = ar[rightPointer];
		while(rightPointer>=0)
		{
			if(ar[rightPointer] != largestCandle)
				break;
			rightPointer--;
		}
		return ar.length-(rightPointer+1);
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	
	    int arCount = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	    int[] ar = new int[arCount];
	
	    String[] arItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	    for (int i = 0; i < arCount; i++) {
	        int arItem = Integer.parseInt(arItems[i]);
	        ar[i] = arItem;
	    }
	
	    int result = birthdayCakeCandles(ar);
	
	    System.out.println(result);
	    /*bufferedWriter.write(String.valueOf(result));
	    bufferedWriter.newLine();
	
	    bufferedWriter.close();*/
	
	    scanner.close();
	}

}
