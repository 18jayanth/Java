class animal1
{
    void sound()
    {
        System.out.println("animal is making sound");
    }
    void greet()
    {
        System.out.println("animal is greeting u");
    }
}
class cat extends  animal1
{ @Override
    void sound()
    {
        System.out.println("cat is making sound");
    }
    void move()
    {
        System.out.println("cat is moving");
    }
}
public class Java_49_Dynamic_method_dispatch {
    public static void main(String[] args) {
        animal1 a=new cat();
        a.sound();//cat is making sound
        a.greet();//animal is greeting u
        //a.move(); error no move function in animal
        //cat c=new animal1(); not allowed downcasting

        cat c=(cat) a;
        c.move();//cat is moving possible Downcasting with explicit cast

    }
}
