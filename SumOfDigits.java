import java.util.Scanner;

class SumOfDigits 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        int temp = num;

        /* 
            567%10 => 7 => sum + 7
            567/10 => 56
        */

        while (temp != 0)
        {
            int remainder = temp%10;
            System.out.println("Remainder: " + remainder);
            sum += remainder;
            System.out.println("Sum: " + sum);
            temp/= 10;
            System.out.println("Temp: " + temp);
        }

        System.out.println("\nSum of " + num + " digits is " + sum);
    }
}
