import java.util.Random;

public class Player
{
	char playerIdentifier;
	Square playerSquare;

	Player(char playerIdentifier)
	{
		this.playerIdentifier = playerIdentifier;
	}

	void setPlayerSquare(Square playerSquare)
	{
		this.playerSquare = playerSquare;
	}

	public boolean move()
	{
		Random r = new Random();
		int count = r.nextInt(6) + 1;

		if (playerSquare.position + count > 49)
		{
			return false;
		}

		int oldposition = playerSquare.position; //E 40 ()
		playerSquare.updatePlayers(this);
		Board.boardSquares[oldposition] = playerSquare; //40 ()

		Square newSquare = new Square(oldposition + count);
		playerSquare = newSquare;

		if (playerSquare.delta != 0)
		{
			oldposition = playerSquare.position;
			newSquare = new Square(oldposition + count);
			playerSquare = newSquare;

			playerSquare.updatePlayers(this);
			playerSquare.setPlayer(this);
		}

		playerSquare.setPlayer(this);
		Board.boardSquares[oldposition+count] = playerSquare;

		System.out.println("\nPlayer " + playerIdentifier + " position: " + playerSquare.position);

		if (playerSquare.position == 49)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public String toString()
	{
		return String.valueOf(playerIdentifier);
	}

}