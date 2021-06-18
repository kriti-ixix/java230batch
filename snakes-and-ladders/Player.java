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

	public String toString()
	{
		return String.valueOf(playerIdentifier);
	}

}