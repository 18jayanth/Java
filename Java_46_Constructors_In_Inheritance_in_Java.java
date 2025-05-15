class base1 {
    public int x;
    public base1()
    {
        System.out.println("base class constructor");
    }
    public base1(int a)
    {
        System.out.println("base class overloaded  constructor with value "+a);
    }
    public base1(int a,int b)
    {
        System.out.println("base class overloaded  constructor with values "+a+" "+b);
    }

}
class derived1 extends base1{

    public derived1()
    {    //super(5);
        super(3,4);
        System.out.println("derived  class constructor");
    }
    public derived1(int a)
    {    super(a);
        //super(3,4);
        System.out.println("derived  class overloaded constructor with value "+a);
    }

}
class child extends  derived1{
    public child()
    {
        System.out.println("this is a child constructor");
    }

    public child(int x)
    {
        super(x);
        System.out.println("this is a child constructor with a value "+x);
    }
}


public class Java_46_Constructors_In_Inheritance_in_Java {
    public static void main(String[] args) {
 //       derived1 d=new derived1();
//        base class constructor
//        derived  class constructor
//        derived1 d1=new derived1(5);

        //child c=new child();
        child c1=new child(5);

    }
}
