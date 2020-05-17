/*
 * Platform:- HackerRank
 * Problem:- hackerrank.com/challenges/mini-max-sum/problem
 * Date:- 05/17/2020
 */

import java.util.Arrays;
import java.util.Scanner;

public class Date_051720_HackerRank_MaxMinSum 
{
	public static void miniMaxSum(int[] arr) 
	{
		Arrays.sort(arr);
		long sum = 0;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		
		System.out.println((sum-arr[4])+" "+(sum-arr[0]));
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        miniMaxSum(arr);
        scanner.close();
	}
}
