interface bicycle
{  //it is public static  final b=45; by default
    int b=45;
    //it is public abstract applybrake(int decrement); by defualt
    void applybrake(int decrement);
    void speedup(int increment);
}
interface horn
{
    void blowhorn();

    default void greet() {
        System.out.println("Hello!");
    }
    static void info() {
        System.out.println("Static method in interface");
    }
    private void helper() {
        System.out.println("This is private helper");
    }




}
class avoncycle implements bicycle,horn
{
    int speed=7;
    //all interface functions should be in public
    public  void applybrake(int decrement)
    {
        speed-=decrement;
        System.out.println(speed);
    }
    public void speedup(int increment)
    {
        speed+=increment;
        System.out.println(speed);
    }
    void horn()
    {
        System.out.println("horning");
    }
     public void blowhorn()
    {
        System.out.println("whistle blows");
    }
}
public class Java_54_Introduction_to_Interfaces {
    public static void main(String[] args) {
        avoncycle a=new avoncycle();
        a.applybrake(5);
        a.speedup(6);
        a.horn();
        //you can add constants to interfaces and can extract it through sub class
        System.out.println(a.b);//45
        //you cannot change properties of interface
      //  a.b=450; error u cannot resign value to final variable
        a.blowhorn();//whistle blows

        a.greet();//Hello!
        //In Java, static methods inside an interface are accessed using the interface name,
        // not through an object or implementing class.
        horn.info();//Static method in interface




    }
}
