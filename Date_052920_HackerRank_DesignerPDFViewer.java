//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
import java.io.IOException;
import java.util.Scanner;

public class Date_052920_HackerRank_DesignerPDFViewer 
{
	public static int designerPdfViewer(int[] h, String word) 
	{
		int len = word.length();
		int maxHeight = 0;
		
		for(int i=0; i<len; i++)
		{
			char ch = word.charAt(i);
			int heightOfCharacter = getHeight(ch, h);
			if(heightOfCharacter > maxHeight)
				maxHeight = heightOfCharacter;
		}
		return maxHeight*len;
    }
	
	public static int getHeight(char ch, int h[])
	{
		return h[((int)ch)-97];
	}

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException 
    {
        int[] h = new int[26];
        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < 26; i++) 
        {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }
        String word = scanner.nextLine();
        int result = designerPdfViewer(h, word);
        System.out.println(String.valueOf(result));
        scanner.close();
    }
}
