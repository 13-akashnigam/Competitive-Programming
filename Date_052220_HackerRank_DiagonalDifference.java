import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Date_052220_HackerRank_DiagonalDifference 
{
	public static int diagonalDifference(List<List<Integer>> arr) 
    {
		int noOfRows = arr.size();
		
		int leftDiagonalValue = 0;
		for(int i=0; i<noOfRows; i++)
			leftDiagonalValue += arr.get(i).get(i);
		
		int rightDiagonalValue = 0;
		for(int i=0; i<noOfRows; i++)
			rightDiagonalValue += arr.get(i).get(noOfRows-i-1);
		
		if(leftDiagonalValue >= rightDiagonalValue)
			return leftDiagonalValue - rightDiagonalValue;
		else
			return rightDiagonalValue - leftDiagonalValue;
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < n; j++) 
            {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        int result = Date_052220_HackerRank_DiagonalDifference.diagonalDifference(arr);
        System.out.println("result = "+result);
	}
}
