import java.util.Scanner;

class Name
{
	public static void main(String[] args)
	{
		System.out.println("Hi!");
		Scanner sc = new Scanner(System.in);
		String myName = sc.next();
		int rollNo = sc.nextInt();
		//System.out.println("Your name is: " + myName);
		System.out.println("Name: " + myName);
		System.out.println("Roll no.: " + rollNo);	
	}
}