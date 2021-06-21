import java.util.ArrayList;

public class Board
{
	static Square[] boardSquares;
	int rows, columns; 

	ArrayList<Player> playersList = new ArrayList<Player>();

	Board(int rows, int columns)
	{
		this.rows = rows; this.columns = columns;
		boardSquares = new Square[rows * columns];

		for (int i = 0; i < rows * columns; i++)
		{
			Square square = new Square(i);
			boardSquares[i] = square;
		}

	}

	public String toString()
	{
		return boardSquares.toString();
	}

	public void addPlayer(Player playerName)
	{
		playersList.add(playerName);
		boardSquares[playerName.playerSquare.position].setPlayer(playerName);
	}

	public Square[][] arrayToMatrix()
	{
		Square[][] boardMatrix = new Square[rows][columns];
		int i = 49;

		for (int row = 0; row <= 9; row++)
		{
			if (row%2==0)
			{
				//Even number of rows
				for (int column = 0; column < 5; column++)
				{
					boardMatrix[row][column] = boardSquares[i--];
				}
			}
			else
			{
				for (int column = 4; column > -1; column--)
				{
					boardMatrix[row][column] = boardSquares[i--];
				}
			}
		}

		return boardMatrix;
	}

	public void printBoard()
	{
		Square[][] boardMatrix = arrayToMatrix();

		for (int r = 0; r<10; r++)
		{
			for (int c = 0; c < 5; c++)
			{
				System.out.print(boardMatrix[r][c]);
			}

			System.out.println("");
		}

	}

	public boolean takeTurns()
	{
		int i = 0; boolean win = false;

		while (!win)
		{
			while (i < playersList.size())
			{
				win = playersList.get(i).move();
				printBoard();

				if (win)
				{
					return true;
				}
				
				i++; 

			}
			i = 0;
		}

		return win;

	}


	public static void main(String[] args)
	{
		Board board = new Board(10, 5);

		Player ePlayer = new Player('E');
		ePlayer.setPlayerSquare(board.boardSquares[0]);
		board.addPlayer(ePlayer);
		
		Player sPlayer = new Player('S');
		sPlayer.setPlayerSquare(board.boardSquares[0]);
		board.addPlayer(sPlayer);

		board.printBoard();
	}

}