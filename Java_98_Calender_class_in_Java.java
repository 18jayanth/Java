import java.util.Calendar;
import java.util.TimeZone;

public class Java_98_Calender_class_in_Java {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());

        Calendar c1=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1);
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());
        System.out.println(c1.getTime());
    }
}
