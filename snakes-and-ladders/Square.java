import java.util.ArrayList;

public class Square 
{
	int position; //Position of the square
	int delta = 0; //How many places a player has to move
	ArrayList<Player> players = new ArrayList<Player>(); //List of players 

	public Square(int position)
	{
		this.position = position;
		delta = setDelta(position);
	}

	int setDelta(int position)
	{
		int currentDelta;

		if (position == 15)
		{
			currentDelta = -1;
		}
		else if (position == 18)
		{
			currentDelta = 4;
		}
		else if (position == 29)
		{
			currentDelta = -4;
		}
		else if (position == 30)
		{
			currentDelta = -1;
		}
		else if (position == 32)
		{
			currentDelta = -4;
		}
		else if (position == 33)
		{
			currentDelta = 2;
		}
		else if (position == 34)
		{
			currentDelta = -1;
		}
		else if (position == 48)
		{
			currentDelta = -3;
		} 
		else 
		{
			currentDelta = 0;
		}

		return currentDelta;
	}

	public String toString()
	{
		String playerInfo = " ";

		for (Player player : players)
		{
			playerInfo += player.toString() + " ";
		}

		String s = playerInfo + " " + position + "( " + (delta==0?" " : String.valueOf(delta)) + " )";
		return s;
	}

}