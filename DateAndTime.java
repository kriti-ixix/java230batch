import java.util.Date;
import java.text.SimpleDateFormat;

class DateAndTime
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("Full Date: " + date); //Returns current date and time
        System.out.println("Time: " + date.getTime()); //Epoch seconds

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        String s = sdf.format(date);
        System.out.println("\nUsing SDF: " + s);

        SimpleDateFormat sdfTime = new SimpleDateFormat("hh:m:ss a");
        String t = sdfTime.format(date);
        System.out.println("\nUsing SDF Time: " + t);

        /*

        d -> day -> 1 or 12
        dd -> two digits -> 01 or 22 
        M -> month -> 3 or 5
        MM -> two digits -> 03 or 05
        MMM -> name of the month -> Jan or Jun or Apr
        y -> year -> 2021
        yy -> last two digits -> 21
        yyyy -> year -> 2021

        h -> hour -> 12 hour format
        H -> hour -> 24 hour format
        hh -> two digits hours -> 01 
        m -> minute
        s -> seconds

        a -> AM/PM
        E -> name of the day 
        
        */
    }
}