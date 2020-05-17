/*
 * Platform:- HackerRank
 * Problem:- https://www.hackerrank.com/challenges/time-conversion/problem
 * Date:- 05/15/2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_051520_HackerRank_TimeConversion 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException 
	{
		//System.out.println("Enter time in AM/PM format");
		String s = in.readLine();
		System.out.println(timeConversion(s));
	}
	
	public static String timeConversion(String s)
	{
		String sSplit[] = s.split(":");
		String HH = sSplit[0];
		String MM = sSplit[1];
		String SS = sSplit[2].substring(0, 2);
		String format = sSplit[2].substring(2, 4);
		if(format.equalsIgnoreCase("AM"))
		{
			if(HH.equals("12"))
				HH = "00";
		}	
		else
		{
			if(HH.equals("12"))
				HH = "12";
			else
				HH = ""+(Integer.parseInt(HH)+12);
		}
		return ""+HH+":"+MM+":"+SS;
	}
}
