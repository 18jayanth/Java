import java.util.Date;

public class Java_97_Data_Class_in_Java {
    public static void main(String[] args) {
        //System.out.println(Float.MAX_VALUE);
        //System.out.println(System.currentTimeMillis());
        //its safe to store milliseconds in float variable
        //Date Constructor
        Date d=new Date();
        Date d1=new Date(1998,5,12/02/2023);
        System.out.println(d);
        //Date Methods
        System.out.println(d.getTime());
        System.out.println(d1.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getTimezoneOffset());//-330
    }
}
