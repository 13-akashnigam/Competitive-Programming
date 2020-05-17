/*
 * Platform:- HackerRank
 * Problem:- https://www.hackerrank.com/challenges/staircase/problem
 * Date:- 05/15/2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_051520_HackerRank 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//System.out.println("Enter the value of n");
		int n = Integer.parseInt(in.readLine());
		stairCase(n);
	}

	public static void stairCase(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j>=n-1-i)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
