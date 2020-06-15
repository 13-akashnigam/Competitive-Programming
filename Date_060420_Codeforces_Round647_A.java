import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060420_Codeforces_Round647_A 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException 
	{
		//System.out.println("Enter the number of tests");
		long t = Long.parseLong(in.readLine());
		
		for(int i=0; i<t; i++)
		{
			//System.out.println("Enter the initial and target value");
			String inputLine1[] = in.readLine().split(" ");
			long initialValue = Long.parseLong(inputLine1[0]);
			long targetValue = Long.parseLong(inputLine1[1]);
			
			long greaterNum;
			long smallerNum;
			
			if(initialValue == targetValue)
			{
				System.out.println("0");
				continue;
			}
			else
			{
				if(initialValue > targetValue)
				{
					greaterNum = initialValue;
					smallerNum = targetValue;
				}
				
				else
				{
					greaterNum = targetValue;
					smallerNum = initialValue;
				}
				
				//System.out.println("greaterNum = "+greaterNum);
				//System.out.println("smallerNum = "+smallerNum);
				
				
				long n=0;
				boolean nExists = false;
				long smallerNumCopy = smallerNum;
				while(smallerNumCopy < greaterNum)
				{
					smallerNumCopy = smallerNumCopy * 2;
					n++;
					if(smallerNumCopy == greaterNum)
					{
						nExists = true;
						break;
					}
				}
				
				//System.out.println("n = "+n);
				//System.out.println("nExists = "+nExists);
				
				if(nExists)
				{
					if(n == 1 || n==2 || n==3)
					{
						System.out.println("1");
						continue;
					}
					else
					{
						long count = 0;
						long start = 8;
						long divValue = greaterNum / smallerNum;
						//System.out.println("divValue ="+divValue);
						
						while(start < divValue)
						{
							//System.out.println("start = "+start);
							count++;
							start = start * 8;
							//Thread.sleep(50000);
						}
						System.out.println((count+1));
					}
				}
				else
				{
					System.out.println("-1");
					continue;
				}
			}
		}
	}
}
