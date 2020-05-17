import java.io.*;
import java.util.*;

public class Date_051420_HackerRank 
{
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
    {
    	int aCount = 0;
    	int bCount = 0;
    	int len = a.size();
    	
    	for(int i=0; i<len; i++)
    	{
    		if(a.get(i) > b.get(i))
    			aCount++;
    		else if(a.get(i) < b.get(i))
    			bCount++;
    	}
    	List<Integer> outputList = new ArrayList<Integer>();
    	outputList.add(aCount);
    	outputList.add(bCount);
    	return outputList;
    }

    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
