import java.util.Scanner;

public class Date_051920_HackerRank_DivisibleSumPairs 
{
	static int divisibleSumPairs(int n, int k, int[] ar)
	{
		int leftPointer1 = 0;
		int leftPointer2;
		int countPairs = 0;
		
		while(leftPointer1 < n)
		{
			leftPointer2 = leftPointer1+1;
			while(leftPointer2 < n)
			{
				if((ar[leftPointer1] + ar[leftPointer2])%k == 0)
					countPairs++;
				leftPointer2++;
			}
			leftPointer1++;
		}
		return countPairs;
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) 
        {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println("result = "+result);
        scanner.close();
	}

}
