 class Employee1 {
    int salary ;
    String name;

    public int getSalary() {
        return salary;

    }
    public String getname() {
        return name;

    }
    public void setname(String name) {
        this.name = name;
    }
     public void setsalary(int sal) {
         this.salary = sal;
     }

    }
    class cellphone{
    public void ringing()
    {
        System.out.println("ringing");
    }
    public void vibrating()
    {
        System.out.println("vibrating");
    }
    }
    class square{
    int s;
    public void side(int a)
    {
        s=a;
    }
    public int area() {
        return s * s;
    }
    public int perimeter()
    {
        return 4*s;
    }
    }

class rectangle{
    int l;
    int b;
    public void side(int a,int c)
    {
        l=a;
        b=c;
    }
    public int area() {
        return l*b;
    }
    public int perimeter()
    {
        return 2 *(l + b);
    }
}
 class circle{
     float r;

     public void side(int a)
     {
         r=a;
     }
     public float area() {
         return (float)3.14 * r *r ;
     }
     public float perimeter()
     {
         return  2 *(float)3.14 * r;
     }
 }
 class game{
    public void hitting()
    {
        System.out.println("I am Hitting");
    }
     public void running()
     {
         System.out.println("I am running");
     }
     public void firing()
     {
         System.out.println("I am firing");
     }

         }


    public class Java_39_Practiceset_8 {
        public static void main(String[] args) {
        //practice-1
            //creating a class with salary,name attributes and getname,setname,getsalary properties
           Employee1 e1=new Employee1();
            e1.setname("Ravi");
             e1.setsalary(50000);
           System.out.println("The salary of employee e1 is "+e1.getSalary());
           System.out.println("The name of employee e1 is "+e1.getname());

//
//            Employee1 e2=new Employee1();
//            e2.setname("Akash");
//            System.out.println("The salary of employee e2 is "+e2.getSalary());
//            System.out.println("The name of employee e2 is "+e2.getname());

            //practice-2
            //create a class cellphone annd create methods for printing "ringing" ,'vibrating'
//            cellphone c1=new cellphone();
//            c1.ringing();
//            c1.vibrating();

            //practice-3
            // create a class square with a method to initialize its size,calulate perimeter,area
            //square s1=new square();
//            s1.side(5);
//            System.out.println("Perimeter of square is "+s1.perimeter());
//            System.out.println("Area of square is "+s1.area());
//
//            square s2=new square();
//            s2.side(10);
//            System.out.println("Perimeter of square is "+s2.perimeter());
//            System.out.println("Area of square is "+s2.area());

            //practice-4
            //create a rectange and repeat 3
//            rectangle s1=new rectangle();
//           s1.side(5,6);
//           System.out.println("Perimeter of Rectangle is "+s1.perimeter());
//            System.out.println("Area of Rectangle is "+s1.area());
//
//            rectangle s2=new rectangle();
//            s2.side(10,12);
//           System.out.println("Perimeter of Rectangle is "+s2.perimeter());
//            System.out.println("Area of Rectangle is "+s2.area());

            //practice-5
            //create a class tom vicette with methods hitting,running firing
            game g=new game();
            g.hitting();
            g.firing();
            g.running();

            //practice-6
            //repeat for circle

//            circle s1=new circle();
//          s1.side(5);
//           System.out.println("Perimeter of Circle is "+s1.perimeter());
//            System.out.println("Area of Circle is "+s1.area());
//
//            circle s2=new circle();
//            s2.side(10);
//           System.out.println("Perimeter of Circle is "+s2.perimeter());
//           System.out.println("Area of Circle is "+s2.area());








        }
    }
