import java.util.Scanner;

public class Play
{
	public static void main(String[] args)
	{
		Board board = new Board(10, 5);

		Player ePlayer = new Player('E');
		ePlayer.setPlayerSquare(board.boardSquares[0]);
		board.addPlayer(ePlayer);

		Player sPlayer = new Player('S');
		sPlayer.setPlayerSquare(board.boardSquares[0]);
		board.addPlayer(sPlayer);

		Scanner scanner = new Scanner(System.in);

		do
		{
			board.printBoard();
			scanner.next();
		} 
		while(!board.takeTurns());
	}
}