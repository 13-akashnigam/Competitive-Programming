import java.io.IOException;
import java.util.Scanner;

public class Date_052720_HackerRank_TimeInWords 
{
	public static String timeInWords(int h, int m) 
	{
		if(m == 0)
			return getStringRepresentationOfNumber(h)+" o' clock";
		else
		{
			String intermediateFirstString = "";
			if(m == 1 || m == 59)
				intermediateFirstString = " minute ";
			else if(m == 15 || m == 30 || m == 45)
				intermediateFirstString = " ";
			else
				intermediateFirstString = " minutes ";
			//System.out.println("intermediateFirstString = "+intermediateFirstString);
			
			String intermediateSecondString = "";
			if(m <= 30)
				intermediateSecondString = "past ";
			else
				intermediateSecondString = "to ";
			//System.out.println("intermediateSecondString ="+intermediateSecondString);
			
			if(m>30)
				h = h+1;
			return getStringRepresentationOfNumber(m)+intermediateFirstString+intermediateSecondString+getStringRepresentationOfNumber(h);
		}
	}
	
	public static String getStringRepresentationOfNumber(int num)
	{
		if(num>=30)
			num = 60 - num;
		String stringRepresentation = "";
		if(num == 1)
			stringRepresentation = "one";
		else if(num == 2)
			stringRepresentation = "two";
		else if(num == 3)
			stringRepresentation = "three";
		else if(num == 4)
			stringRepresentation = "four";
		else if(num == 5)
			stringRepresentation = "five";
		else if(num == 6)
			stringRepresentation = "six";
		else if(num == 7)
			stringRepresentation = "seven";
		else if(num == 8)
			stringRepresentation = "eight";
		else if(num == 9)
			stringRepresentation = "nine";
		else if(num == 10)
			stringRepresentation = "ten";
		else if(num == 11)
			stringRepresentation = "eleven";
		else if(num == 12)
			stringRepresentation = "twelve";
		else if(num == 13)
			stringRepresentation = "thirteen";
		else if(num == 14)
			stringRepresentation = "fourteen";
		else if(num == 15)
			stringRepresentation = "quarter";
		else if(num == 16)
			stringRepresentation = "sixteen";
		else if(num == 17)
			stringRepresentation = "seventeen";
		else if(num == 18)
			stringRepresentation = "eightteen";
		else if(num == 19)
			stringRepresentation = "nineteen";
		else if(num == 20)
			stringRepresentation = "twenty";
		else if(num == 21)
			stringRepresentation = "twenty one";
		else if(num == 22)
			stringRepresentation = "twenty two";
		else if(num == 23)
			stringRepresentation = "twenty three";
		else if(num == 24)
			stringRepresentation = "twenty four";
		else if(num == 25)
			stringRepresentation = "twenty five";
		else if(num == 26)
			stringRepresentation = "twenty six";
		else if(num == 27)
			stringRepresentation = "twenty seven";
		else if(num == 28)
			stringRepresentation = "twenty eight";
		else if(num == 29)
			stringRepresentation = "twenty nine";
		else if(num == 30)
			stringRepresentation = "half";
		return stringRepresentation;
	}

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException 
    {
        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String result = timeInWords(h, m);
        System.out.println(result);
        scanner.close();
    }
}
