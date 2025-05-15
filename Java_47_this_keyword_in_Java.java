class random{
    int a;

    //case-3 : Constructor chaining using this()
   //Constructor random() calls random(int) using this(...).
    public random()
    {
        this(5);
    }
    //case-1::  this is used to Distinguishing between instance variables and parameters
    //Without this, Java would not distinguish between a (parameter) and a (instance variable).

    public random(int a){
        this.a=a;
    }
    public int  add()
    {
        return  5+a;
    }
    //case-2 :this is used to Call a method of the current class
    public int  subtract()
    {
        return this.add();
    }



// Case-4: this keyword used to Pass current object as parameter
    void display()
    {
        System.out.println("Hello world");
    }

    void calldisplay(random obj)
    {
        obj.display();
    }
    void start()
    {
        calldisplay(this);
    }


    //case-5 this is used to Return current object (useful for method chaining)
  int value=0;
    random add(int a)
    {
        value+=a;
        return this;
    }
    random multiply(int b)
    {
        value*=b;
        return this;
    }
    void results()
    {
        System.out.println(value);
    }

}
public class Java_47_this_keyword_in_Java {
    public static void main(String[] args) {
        random r=new random(6);
        System.out.println(r.add());//11
        System.out.println(r.subtract());//11


        random r1=new random();
        r1.start();//Hello world

        random r3=new random();
        r3.add(5).multiply(6).results();//30

    }
}
