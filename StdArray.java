import java.util.*;

class StdArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] stdNames = new int[5];

        for (int i=0; i<stdNames.length; i++)
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            stdNames[i] = num;
        }

        System.out.println(Arrays.toString(stdNames));

    } 
}
