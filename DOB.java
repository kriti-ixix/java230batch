import java.util.*;
import java.text.SimpleDateFormat;

class DOB 
{
    String name = "", dateOfBirth = "";
    public static void main(String[] args)
    {
        //Changing the date
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1999);
        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DAY_OF_MONTH, 22);
        Date dob = cal.getTime();
        
        //Formatting the date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String studentBirthday = sdf.format(dob);
        //System.out.println("\nDate of Birth: " + studentBirthday + "\n");

        //Adding the student information
        DOB student1 = new DOB();
        student1.name = "ABC";
        student1.dateOfBirth = studentBirthday;

        System.out.println("Name: " + student1.name + "\t" + "DOB: " + student1.dateOfBirth);
    }    
}
