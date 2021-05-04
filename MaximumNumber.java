import java.util.Arrays;

class MaximumNumber
{
    public static void main(String[] args) 
    {
        int[] numbers = {3, 4, 10, 15, 5};
        int temp = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i+1; j < numbers.length; j++)
            {
                if (numbers[i]>numbers[j])
                {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(temp);
    }
}