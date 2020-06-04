import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_060120_HackerRank_QueensAttackII 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException 
	{
		//System.out.println("Enter the size of the board and the number of obstacles");
		String input1[] = in.readLine().split(" ");
		int size = Integer.parseInt(input1[0]);
		int numberOfObstracles = Integer.parseInt(input1[1]);

		int board[][] = new int[size][size];

		//System.out.println("Enter the position of the queen");
		String input2[] = in.readLine().split(" ");
		int queensRow = size - Integer.parseInt(input2[0]);
		int queensCol = Integer.parseInt(input2[1]) - 1;

		board[queensRow][queensCol] = 50;

		for(int i=0; i<numberOfObstracles; i++)
		{
			//System.out.println("Entet the position of the obstracle");
			String input3[] = in.readLine().split(" ");
			int obstracleRow = size - Integer.parseInt(input3[0]);
			int obstracleCol = Integer.parseInt(input3[1]) - 1;
			board[obstracleRow][obstracleCol] = -1;
		}

		int leftMoves = 0;
		for(int col=queensCol-1; col>=0; col--)
		{
			if(board[queensRow][col]== -1)
				break;
			leftMoves++;
		}

		//System.out.println("leftMoves = "+leftMoves);

		int rightMoves = 0;
		for(int col=queensCol+1; col<size; col++)
		{
			if(board[queensRow][col]== -1)
				break;
			rightMoves++;
		}

		//System.out.println("rightMoves = "+rightMoves);

		int upMoves = 0;
		for(int row=queensRow-1; row>=0; row--)
		{
			if(board[row][queensCol]== -1)
				break;
			upMoves++;
		}

		//System.out.println("upMoves = "+upMoves);

		int downMoves = 0;
		for(int row=queensRow+1; row<size; row++)
		{
			if(board[row][queensCol]== -1)
				break;
			downMoves++;
		}

		//System.out.println("downMoves = "+downMoves);

		int diagonalRightUp = 0;
		for(int row=queensRow-1, col=queensCol+1; row>=0 && col<size; row--, col++)
		{
			if(board[row][col]== -1)
				break;
			diagonalRightUp++;
		}

		//System.out.println("diagonalRightUp = "+diagonalRightUp);

		int diagonalLeftDown = 0;
		for(int row=queensRow+1, col=queensCol-1; row<size && col>=0; row++, col--)
		{
			if(board[row][col]== -1)
				break;
			diagonalLeftDown++;
		}

		//System.out.println("diagonalLeftDown = "+diagonalLeftDown);

		int diagonalRightDown = 0;
		for(int row=queensRow+1, col=queensCol+1; row<size && col<size; row++, col++)
		{
			if(board[row][col]== -1)
				break;
			diagonalRightDown++;
		}

		//System.out.println("diagonalRightDown = "+diagonalRightDown);

		int diagonalLeftUp = 0;
		for(int row=queensRow-1, col=queensCol-1; row>=0 && col>=0; row--, col--)
		{
			if(board[row][col]== -1)
				break;
			diagonalLeftUp++;
		}

		//System.out.println("diagonalLeftUp = "+diagonalLeftUp);

		System.out.println(leftMoves+rightMoves+upMoves+downMoves+diagonalRightUp+diagonalLeftDown+diagonalRightDown+diagonalLeftUp);
	}
}
