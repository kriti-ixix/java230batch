import java.util.Scanner;

class Area
{
	public void squareArea(int s)
	{
		System.out.println("Area of square is: " + s*s);
	}

	public void rectangleArea(int l, int b)
	{
		System.out.println("Area of rectangle is: " + l*b);
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Area area = new Area();
		int side, length, breadth;

		try
		{
			side = scanner.nextInt();
			length = scanner.nextInt();
			breadth = scanner.nextInt();

			if (side < 0 || length < 0 || breadth < 0)
			{
				throw new ArithmeticException();
			}

			area.squareArea(side);
			area.rectangleArea(length, breadth);
		}

		catch (ArithmeticException e)
		{
			System.out.println("These values cannot be negative");
		}

	}
}