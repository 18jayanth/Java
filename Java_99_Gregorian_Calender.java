import java.util.Calendar;

public class Java_99_Gregorian_Calender {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));//22
        System.out.println(c.get(Calendar.YEAR));//2025
        System.out.println(c.get(Calendar.MONTH));//4 months starts from 0

        System.out.println(c.get(Calendar.SECOND));//56
        System.out.println(c.get(Calendar.MINUTE));//50
        System.out.println(c.get(Calendar.HOUR));//7
        System.out.println(c.get(Calendar.HOUR_OF_DAY));//7 24 hours clock
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println("-------------------------------");
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//22
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//5
        System.out.println(c.get(Calendar.DAY_OF_YEAR));//142


    }
}
