interface MyInterface
{
	//Function declaration
	void calculation(int a, int b);
}

class First implements MyInterface
{
	public void calculation(int a, int b)
	{
		System.out.println("Add: " + String.valueOf(a + b));
	}
}

class Second implements MyInterface
{
	public void calculation(int a, int b)
	{
		System.out.println("Subtract: " + String.valueOf(a - b));
	}

	public static void main(String[] args)
	{
		First first = new First();
		first.calculation(5, 10);

		Second second = new Second();
		second.calculation(5, 10);

		String number1 = "50";
		String number2 = "10.5";

		int x1 = Integer.parseInt(number1);
		double x2 = Double.parseDouble(number2);

		System.out.println(x1 + x2); 
	}
}