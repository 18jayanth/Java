class parent
{
    void display()
    {
        System.out.println("parent class method");
    }
}
class child1 extends parent
{

    void bold()
    {
        System.out.println("I am bold");
    }
    @Override
    //this is not mandatory to write this annotation but if we change either
    //parent method or child method so that over riding is not happening then it will throw error
    void display()
    {
        System.out.println("Child class method");
    }
}

public class Java_48_method_overriding_in_Java {
    public static void main(String[] args) {
        parent p=new parent();
        p.display();
        child1 c=new child1();
        c.display();//method overriding
        c.bold();
        //all are inherited except display method

    }
}
