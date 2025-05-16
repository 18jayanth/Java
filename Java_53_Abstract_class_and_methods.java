abstract class base2 {
    void sayhello() {
        System.out.println("Hello");
    }

    abstract void greet();
}

class child2 extends base2 {
    @Override
    public void greet() {

        System.out.println("good morning");
    }
}
abstract class child3 extends base2{
    void too()
    {
        System.out.println("Hello");
    }
}
class child4 extends base2{
    void too()
    {
        System.out.println("Hello");
    }
    void greet()
    {
        System.out.println("how do u do");
    }
}


public class Java_53_Abstract_class_and_methods {
    public static void main(String[] args) {
        child2 c = new child2();
        child4 c1=new child4();
        c1.greet();//how do u do
        c.greet();//good morning
        // base2 b=we cannot create objects to abstract classes
        //child3 c=new child3() ;cannot create objects to abstract classes
        //abstarct class provides rules for inheriting classes but its not a atual class
    }
}
