import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/drawing-book/problem
public class Date_052920_HackerRank_DrawingBook 
{
	public static int pageCount(int n, int p) 
	{
        return Math.min(p/2, (n/2)-(p/2));
    }

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException
    {
        int n = Integer.parseInt(in.readLine());
        int p = Integer.parseInt(in.readLine());
        int result = pageCount(n, p);
        System.out.println(String.valueOf(result));
    }
}
