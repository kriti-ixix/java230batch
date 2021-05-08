import java.util.*;

class ObjectArrays 
{
    String name, subject = ""; int rollNo; char gender = 'F';

    public static void main(String[] args)
    {
        //ObjectArrays object = new ObjectArrays();
        ObjectArrays[] student =  new ObjectArrays[5];
        Scanner sc = new Scanner(System.in);  

        for (int i=0; i<student.length; i++)
        {
            ObjectArrays object = new ObjectArrays();
            object.name = sc.next();
            object.rollNo = i;
            student[i] = object;
        }

        //System.out.println(Arrays.toString(student));
        System.out.println(student[0].name);

    }    
}
