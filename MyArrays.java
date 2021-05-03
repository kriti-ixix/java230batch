class MyArrays 
{
    public static void main(String[] args)
    {
        //Size of an array is fixed
        //Integer array
        int[] rollNumber = {5, 10, 15, 20, 25};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        System.out.println(rollNumber[2]);

        for (int i=0; i<rollNumber.length; i++)
        {
            System.out.println(rollNumber[i]);
        }
    }    
}
