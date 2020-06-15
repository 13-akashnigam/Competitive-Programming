import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Date_060420_Codeforces_Round647_B 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		//System.out.println("Enter the number of tests");
		long t = Long.parseLong(in.readLine());
		
		outermost: for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the number of elements in the set");
			long n = Long.parseLong(in.readLine());
			//System.out.println("Enter the number of the set");
			String inputLine2[] = in.readLine().split(" ");
			
			int largestInput = 0;
			ArrayList<Integer> inputList = new ArrayList<>();
			for(int j=0; j<n; j++)
			{
				int ele = Integer.parseInt(inputLine2[j]);
				if(ele > largestInput)
					largestInput = ele;
				inputList.add(ele);
			}
			Collections.sort(inputList);
			//System.out.println("input list = "+inputList);
			
			ArrayList<Integer> outputList = new ArrayList<>();
			for(int k=1; k<=largestInput; k++)
			{
				for(int l=0; l<n; l++)
				{
					outputList.add(inputList.get(l) ^ k);
				}
				Collections.sort(outputList);
				//System.out.println("outputList list = "+outputList);
				if(inputList.equals(outputList))
				{
					//System.out.println("Match found at k = "+k);
					System.out.println(k);
					continue outermost;
				}
				outputList.clear();
			}
			System.out.println("-1");
		}
	}

}
