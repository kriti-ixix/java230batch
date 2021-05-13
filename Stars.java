class Stars
{
	public static void main(String[] args)
	{
		//Nested loops

		//Outer loop handling rows
		for (int i = 1; i<=5; i++)
		{
			System.out.print("Row " + i + ": " );

			//Inner loop handling columns
			for (int j = 1; j<=i; j++) 
			{
				System.out.print(j + " ");
			}

			System.out.println("");
		}
	}
}

/*

Output:

*
* *
* * *
* * * *
* * * * *

*/