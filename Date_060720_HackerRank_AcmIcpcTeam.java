import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Date_060720_HackerRank_AcmIcpcTeam 
{
	public static void main(String[] args) throws IOException 
	{	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the number of attendees and the number of topics");
		String inputLine1[] = in.readLine().split(" ");
		int n = Integer.parseInt(inputLine1[0]);
		int m = Integer.parseInt(inputLine1[1]);

		String inputLine2[] = new String[n];

		for(int i=0; i<n; i++)
		{
			//System.out.println("Enter the topic string for the attendee");
			inputLine2[i] =  in.readLine();
		}

		//System.out.println("Topics: "+Arrays.toString(inputLine2));

		List<String> orEdStrings = new ArrayList<>();

		for(int i=0; i<n; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				orEdStrings.add(getORString(inputLine2[i], inputLine2[j]));
			}
		}

		//System.out.println("OrEd Strings: "+orEdStrings);

		int lenList = orEdStrings.size();
		List<Integer> countOf1s = new ArrayList<>();

		for(int k=0; k<lenList; k++)
		{
			String orEdString = orEdStrings.get(k);
			countOf1s.add(getCountOf1(orEdString));
		}

		//System.out.println("Count of 1s in Ored Strings: "+countOf1s);

		Collections.sort(countOf1s);
		//System.out.println("Count of 1s in Ored Strings after sorting: "+countOf1s);

		System.out.println(countOf1s.get(countOf1s.size()-1));

		int lastPointer = countOf1s.size()-1;
		int element = countOf1s.get(lastPointer);

		int countOfTeamsWithMaxKnowlwdge = 0;
		while(countOf1s.get(lastPointer) == element)
		{
			countOfTeamsWithMaxKnowlwdge++;
			lastPointer--;
			continue;
		}
		System.out.println(countOfTeamsWithMaxKnowlwdge);
	}

	public static String getORString(String s1, String s2)
	{
		int len = s1.length();
		String s3 = "";
		for(int j=0; j<len; j++)
		{
			char ch1 = s1.charAt(j);
			char ch2 = s2.charAt(j);

			if(ch1 == '1' || ch2 == '1')
				s3 = s3 + '1';
			else
				s3 = s3 + '0';
		}
		return s3;
	}

	public static int getCountOf1(String s1)
	{
		int len = s1.length();
		int countOfOne = 0;

		for(int l = 0; l<len; l++)
		{
			if(s1.charAt(l) == '1')
				countOfOne++;
		}
		return countOfOne;
	}
}
