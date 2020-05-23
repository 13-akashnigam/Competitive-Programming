import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Date_052220_HackerRank_CutTheSticks 
{
	static int[] cutTheSticks(int[] arr) 
	{
		int len = arr.length;
		int remainingSticks = len;
		List<Integer> output = new ArrayList<>();
		Arrays.sort(arr);
		
		int leftPointer1 = 0;
		int leftPointer2 = 0;
		
		output.add(remainingSticks);
		while(leftPointer2<len)
		{
			while(arr[leftPointer2] == arr[leftPointer1])
			{
				leftPointer2++;
				if(leftPointer2>=len)
					break;
			}
			remainingSticks = len-leftPointer2;
			if(remainingSticks <= 0)
				break;
			output.add(remainingSticks);
			leftPointer1 = leftPointer2;
		}
		
		int outputLen = output.size();
		int result[] = new int[outputLen];
		for(int i=0; i<outputLen; i++)
			result[i] = output.get(i);
		return result;
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) 
        {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) 
            {
            		System.out.print("\n");
            }
        }
        scanner.close();
	}	
}
