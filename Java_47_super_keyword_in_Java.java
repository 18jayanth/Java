

class animal
{
    String name="animal";
    animal()
    {
        System.out.println("Animal class constructor");
    }
    void sound()
    {
        System.out.println("Animal makes sound");
    }

}
class dog extends animal
{
    String name="dog";
    dog()

    {
        //2. super() to call superclass constructor (optional) must be the 1st statement
        super();
        System.out.println("dog class constructor");
    }
    void sound()
    {
        System.out.println("dog marks");
        super.sound();
    }
    void details()
    {
        System.out.println(name);
        //Case-1. super to access superclass variables
        System.out.println(super.name);
    }
}
public class Java_47_super_keyword_in_Java {
    public static void main(String[] args) {
        dog d=new dog();
        d.details();
        d.sound();

    }
}
