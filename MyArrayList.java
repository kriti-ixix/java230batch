import java.util.ArrayList;
import java.util.Scanner;

class MyArrayList
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println("Size: " + list.size());

		for (int i=1; i<=5; i++)
		{
			int num = scanner.nextInt();
			list.add(num);
			System.out.println(list);
			System.out.println("Size: " + list.size());
		}

		list.clear();
		System.out.println(list);
		System.out.println("Size: " + list.size());
	}
}