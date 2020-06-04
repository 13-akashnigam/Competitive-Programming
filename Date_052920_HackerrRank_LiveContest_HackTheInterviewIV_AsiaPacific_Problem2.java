import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date_052920_HackerrRank_LiveContest_HackTheInterviewIV_AsiaPacific_Problem2 
{
	public static String arrangeStudents(List<Integer> a, List<Integer> b) 
	{
		int numberOfBoysNGirls = a.size();
		
		Integer boysArray[] = new Integer[numberOfBoysNGirls];
		boysArray = a.toArray(boysArray);
		
		Integer girlsArray[] = new Integer[numberOfBoysNGirls];
		girlsArray = b.toArray(girlsArray);
		
		Arrays.sort(boysArray);
		Arrays.sort(girlsArray);
		
		//System.out.println("Boys array after sorting = "+Arrays.toString(boysArray));
		//System.out.println("Girls array after sorting = "+Arrays.toString(girlsArray));
		
		Integer arrange1[] = new Integer[2*numberOfBoysNGirls];
		Integer arrange2[] = new Integer[2*numberOfBoysNGirls];
		
		int boysPointer = 0;
		int girlsPointer = 0;
		int arrange1Pointer = 0;
		
		while(boysPointer < numberOfBoysNGirls && girlsPointer < numberOfBoysNGirls && arrange1Pointer<2*numberOfBoysNGirls)
		{
			arrange1[arrange1Pointer] = boysArray[boysPointer];
			arrange1Pointer++;
			boysPointer++;
			arrange1[arrange1Pointer] = girlsArray[girlsPointer];
			arrange1Pointer++;
			girlsPointer++;
		}
		
		//System.out.println("Arrange 1 array = "+Arrays.toString(arrange1));
		
		boysPointer = 0;
		girlsPointer = 0;
		int arrange2Pointer = 0;
		
		while(boysPointer < numberOfBoysNGirls && girlsPointer < numberOfBoysNGirls && arrange2Pointer<2*numberOfBoysNGirls)
		{
			arrange2[arrange2Pointer] = girlsArray[girlsPointer];
			arrange2Pointer++;
			girlsPointer++;
			arrange2[arrange2Pointer] = boysArray[boysPointer];
			arrange2Pointer++;
			boysPointer++;
		}
		
		//System.out.println("Arrange 2 array = "+Arrays.toString(arrange2));
		
		boolean isArrange1Inreasing = true;
		
		for(int ii=0; ii<2*numberOfBoysNGirls-1; ii++)
		{
			if(arrange1[ii+1] < arrange1[ii])
			{
				isArrange1Inreasing = false;
				break;
			}
		}
		
		boolean isArrange2Inreasing = true;
		
		for(int jj=0; jj<2*numberOfBoysNGirls-1; jj++)
		{
			if(arrange2[jj+1] < arrange2[jj])
			{
				isArrange2Inreasing = false;
				break;
			}
		}
		
		//System.out.println("isArrange1Inreasing = "+isArrange1Inreasing);
		//System.out.println("isArrange2Inreasing = "+isArrange2Inreasing);
		
		if(isArrange1Inreasing==true || isArrange2Inreasing==true)
			return "YES";
		return "NO";
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bufferedReader.readLine().trim());
		for (int tItr = 0; tItr < t; tItr++) 
		{
			int n = Integer.parseInt(bufferedReader.readLine().trim());
			String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
			List<Integer> a = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				int aItem = Integer.parseInt(aTemp[i]);
				a.add(aItem);
			}
			String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
			List<Integer> b = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				int bItem = Integer.parseInt(bTemp[i]);
				b.add(bItem);
			}
			String result = arrangeStudents(a, b);
			System.out.println(result);
		}
		bufferedReader.close();
	}
}
