import java.util.*;

class MyCalendar 
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        System.out.println("\nCurrent date: " + currentDate);

        cal.set(Calendar.MONTH, 1);
        Date newDate = cal.getTime();
        System.out.println("\nNew date: " + newDate);
    }    
}