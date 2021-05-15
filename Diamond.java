class Diamond
{
	public static void main(String[] args)
	{
		//Outer loop handling rows
		for (int row = 5; row>0; row--)
		{
			int space = row-1;
			int star = 5 - space;
			int rstar = star - 1;

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

			//Inner loop handling stars on right side
			for (int l = 1; l<=rstar; l++)
			{
				System.out.print("*");
			}
			
			System.out.println("");

		}

		//Outer loop handling bottom half


	}
}

/*

row 5 -> 4 spaces + 1 star + 0 rstar
row 4 -> 3 spaces + 2 star + 1 rstar
row 3 -> 2 spaces + 3 star + 2 rstar
row 2 -> 1 spaces + 4 star + 3 rstar
row 1 -> 0 spaces + 5 star + 4 rstar

*/
