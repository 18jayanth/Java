//we cant extend multiple abstract classes but we can implement multiple interfaces at a time
//we can create concrete methods in abstarct class but not in interface
abstract class phone
{
    int i=5;
    abstract void switchoff();
    //abstract class can contain concrete methods
    void ringing()
    {
        System.out.println("Phone is ringing");
    }
}
interface bicycle1
{  //it is public static  final b=45; by default
    int b=45;
    //it is public abstract applybrake(int decrement); by defualt
    void applybrake(int decrement);
    void speedup(int increment);
}

class smartphone extends phone{
    void switchoff()
    {
        System.out.println("phone is switched off");
    }
}

class avoncycle1 implements bicycle1 {
    int speed = 7;

    //all interface functions should be in public
    public void applybrake(int decrement) {
        speed -= decrement;
        System.out.println(speed);
    }

    public void speedup(int increment) {
        speed += increment;
        System.out.println(speed);
    }

    void horn() {
        System.out.println("horning");
    }
}




public class Java_55_Abstarct_classes_VS_Interfaces {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.switchoff();//phone is switched off
        s.ringing();//Phone is ringing
        System.out.println(s.i);//5

        avoncycle1 a=new avoncycle1();
        a.applybrake(5);
        a.speedup(5);

    }


}
