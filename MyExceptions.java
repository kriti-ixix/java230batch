class MyExceptions
{
	public static void main(String[] args)
	{
		try
		{
			//Normal execution of the program
			int[] myArray = {0, 1, 2, 3, 4};
			System.out.println(myArray[10]);
		}

		catch (ArrayIndexOutOfBoundsException e) //Array index exception block
		{
			System.out.println("The index was too high");
		}

		catch (Exception e) //General exception block
		{
			//In case of an exception
			System.out.println("An exception occurred");
			e.printStackTrace();
		}
	}
}