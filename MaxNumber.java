class MaxNumber 
{
    public static void main(String[] args)
    {
        int[] numbers = {4, 5, 9, 10, 22, 5};
        int maxNumber = numbers[0];
        int secondMax = numbers[0];

        for (int i: numbers)
        {
            if (i > maxNumber)
            {
                secondMax = maxNumber;
                maxNumber = i;
            }

            if (i > secondMax && i < maxNumber)
            {
                secondMax = i;
            }

            System.out.println("Max Number: " + maxNumber);
            System.out.println("Second Max: " + secondMax + "\n");

        }
    }
}
