import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Date_051820_HackerRank_CountingValleys 
{
	static int countingValleys(int n, String s) 
	{
		int currentYIndex = 0;
		int prevYIndex = 0;
		int valleyCount = 0;
		
		for(int i=0; i<n; i++)
		{
			char ch = s.charAt(i);
			prevYIndex = currentYIndex;
			if(ch == 'D')
				currentYIndex--;
			else
				currentYIndex++;
			if(prevYIndex == 0 && currentYIndex == -1)
				valleyCount++;
		}
		return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException 
	{
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        int result = countingValleys(n, s);
        System.out.println("result = "+result);
        scanner.close();
	}

}
