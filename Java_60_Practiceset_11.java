interface smarttvremote
{
    void smart();

}
interface tvremote extends smarttvremote
{
    void tvremote();
}
class tv implements  tvremote
{
    public void tvremote()
    {
        System.out.println("its a tv remote");
    }
    public void smart()
    {
        System.out.println("its a tv smart remote");
    }
}
abstract class pen
{
    abstract void write();
    abstract void refill();

}
class fountainpen extends pen
{

    void write()
    {
        System.out.println("writing");
    }
     void refill()
     {
         System.out.println("refilling");
     }
    void changenib()
    {
        System.out.println("please change the nib");
    }
}
class pen1 extends pen
{
    void write()
    {
        System.out.println("pen is writing");
    }
     void refill()
     {
         System.out.println("pen is refilling");
     }
}
abstract class telephone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}



class smarttelephone extends telephone
{
    void ring()
    {
        System.out.println("phone is ringing");
    }
    void lift()
    {
        System.out.println("phone is lifting");
    }
    void disconnect()
    {
        System.out.println("phone is disconnecting");
    }
    void own()
    {
        System.out.println("smart telephone method");
    }
}

class monkey
{
    void jump()
    {
        System.out.println("jumping");
    }
    void bite()
    {
        System.out.println("biting");
    }
}
interface basicanimal
{
    void eat();
    void sleep();
}
class human extends monkey implements  basicanimal
{
   public  void eat()
    {
        System.out.println("eating");
    }
    public  void sleep()
    {
        System.out.println("sleeping");
    }
}
public class Java_60_Practiceset_11 {
    public static void main(String[] args) {
        //pratice-1
        //create a abstarct class pen with methods write and refill as abstarct methods
        pen1 p=new pen1();
        p.write();
        p.refill();

        //practice-2 using pen from 1 and create concrete class fountain pen and its method
        // changenib
        
        fountainpen p1=new fountainpen();
        p1.changenib();
        p1.refill();
        p1.write();


//        MyOuter.Inner inner = outer.new Inner();
//        inner.innerMethod();
//        pen.fountainpen p=new pen.fountainpen();



        //practice-3 craete a class monkey with jump and bite methods
        //create a class human which inherits this monkey class and implements
        //basicanimal interface with eat and sleep methods
        human h=new human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();


//pactice-4 create a class telephone with methods ring(),lift(),disconnect()
  //      as abstarct methods create another class smarttelephone and demonstrate polymorphism
        smarttelephone t=new smarttelephone();
        t.ring();
        t.disconnect();
        t.lift();
        t.own();
        //polymorphism
        telephone t1=new smarttelephone() ;
        t1.disconnect();
        t1.lift();
        t1.ring();
       // t1.own(); not possible






        //practice-6 create a interface tvremote and use it to inherit another interface
        //smarttvremote
        //practice-7-create a class tv which implements tvremote interface from 6
        tv tv=new tv();
        tv.smart();
        tv.tvremote();



    }
}
