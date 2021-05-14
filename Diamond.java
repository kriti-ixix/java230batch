class Diamond
{
	public static void main(String[] args)
	{
		//Outer loop handling rows
		for (int row = 5; row>0; row--)
		{
			int space = row-1;
			int star = 5 - space;

			//Inner loop handling white spaces
			for (int j = 1; j<=space; j++)
			{
				System.out.print(" ");
			}

			//Inner loop handling stars on left side
			for (int k = 1; k<=star; k++)
			{
				System.out.print("*");
			}

			System.out.println("");

		}
	}
}

/*

row 5 -> 4 spaces + 1 star
row 4 -> 3 spaces + 2 star
row 3 -> 2 spaces + 3 star

*/