import java.util.*;

class AvgArrays 
{
    public static void main(String[] args)
    {
        int[] myArray = {5, 25, 4, 10, 30, 100, 50};
        int sum = 0;

        for (int i=0; i<myArray.length; i++)
        {
            int currentNum = myArray[i];
            System.out.println("Current Number: " + currentNum);
            sum += currentNum;
            System.out.println("Sum: " + sum);
        }

        float average = sum/myArray.length;
        System.out.println("Average: " + average);
    }    
}
