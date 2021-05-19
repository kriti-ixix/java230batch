import java.util.Scanner;

class Division
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		try
		{
			System.out.println("Enter two numbers: ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = x/y;
			System.out.println("Output: " + z);
		}

		catch (ArithmeticException e)
		{
			System.out.println("Division by zero is not possible");
			e.printStackTrace();
		}
	}
}