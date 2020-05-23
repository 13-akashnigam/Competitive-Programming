import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Date_051820_HackerRank_BiggerIsGreater {

	static String biggerIsGreater(String w) 
	{
		int len = w.length();
		//System.out.println("len = "+len);
		int charValues[] = new int[len];
		//System.out.println("charValues[] arrray created");
		for(int i=0; i<len; i++)
			charValues[i] = (int)w.charAt(i);
		//System.out.println("charValues[] = "+Arrays.toString(charValues));
		
		int rightPointer1 = len-1;
		while(rightPointer1>0)
		{
			if(charValues[rightPointer1-1] < charValues[rightPointer1])
				break;
			rightPointer1--;
		}
		
		//System.out.println("rightPointer1 = "+rightPointer1);
		if(rightPointer1 == 0)
			return "no answer";
		
		int rightPointer2 = len-1;
		while(rightPointer2>=0)
		{
			if(charValues[rightPointer2] > charValues[rightPointer1-1])
				break;
			rightPointer2--;
		}
		
		//System.out.println("rightPointer2 = "+rightPointer2);
		
		int temp = charValues[rightPointer1-1];
		charValues[rightPointer1-1] = charValues[rightPointer2];
		charValues[rightPointer2] = temp;
		
		//System.out.println("Values of rightPointer1-1 annd rightPointer2 swapped");
		//System.out.println("Array after swapping = "+Arrays.toString(charValues));
		
		Arrays.sort(charValues, rightPointer1, len);
		//System.out.println("After sorting = "+Arrays.toString(charValues));
		
		
		String result = "";
		for(int i=0; i<len; i++)
		{
			result += (char)charValues[i];
		}
		
		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int TItr = 0; TItr < T; TItr++) 
        {
            String w = scanner.nextLine();
            String result = biggerIsGreater(w);
            System.out.println("result = "+result);
        }
        scanner.close();
	}

}
