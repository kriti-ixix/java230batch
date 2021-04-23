import java.util.Scanner;

class Calculator
{
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Make your choice:\n");
		System.out.println("1. Addition\t2.Subtraction\t3.Multiplication\t4.Division");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		if (choice==1)
		{
			//Addition
		}
		else if (choice == 2)
		{
			//Subtraction
		}
		else if (choice == 3)
		{
			//Multiplication
		}	
		else if (choice == 4)
		{
			//Division
		}
		else
		{
			System.out.println("Invalid entry");
		}
	}
}