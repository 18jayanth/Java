//class cylinder
//{
//    private int height;
//    private int  radius;
//
//    public int get_height()
//    {
//        return height;
//    }
//    public int get_radius()
//    {
//        return radius;
//    }
//    public void set_radius(int r)
//    {
//        radius=r;
//    }
//    public void set_height(int  h)
//    {
//        height=h;
//    }
//    public float calcsurfacearea()
//    {
//        //A=2πrh+2πr2
//        return 2*Math.PIf*height+2*Math.PIf*radius*radius;
//    }
//    public float calcvolume()
//    {
//
//        return Math.PI*radius*radius*height;
//    }
//}
class cylinder
{
    private int height;
     private int  radius;

     public cylinder(int h,int r)
     {
         height=h;
         radius=r;
     }
    public int get_height()
    {
       return height;
    }
   public int get_radius()
    {
        return radius;
   }

}
class Rectangle1
{
    private int height;
    private int  width;

    public Rectangle1(int h,int w)
    {
        height=h;
        width=w;
    }
    public Rectangle1()
    {
        height=100;
        width=150;
    }
    public int get_height()
    {
        return height;
    }
    public int get_width()
    {
        return width;
    }

}
class circle1 {

    private int radius;


    public int get_radius() {
        return radius;
    }

    public void set_radius(int r) {
        radius = r;
    }
}

public class Java_44_Practiceset_9 {


    public static void main(String[] args) {


        //practice-1
        //create a class cylinder and use setters and getters to set its height and radius
//        cylinder c = new cylinder();
//        c.set_radius(5);
//        c.set_height(5);
//        System.out.println("height "+c.get_height());
//        System.out.println("radius "+c.get_height());

        //practice-2 calculate surface area volume of cylinder
//        System.out.println("surface area "+c.calcsurfacearea());
//        System.out.println("volume "+c.calcvolume());

        //practice-3 use constructor to do 1
//        cylinder c=new cylinder(5,6);
//        System.out.println("height "+c.get_height());
//        System.out.println("radius "+c.get_radius());

//practice-4 overload a constructor for a rectangle to give various inputs
        Rectangle1 r=new Rectangle1(200,250);
        System.out.println("height "+r.get_height());
        System.out.println("radius "+r.get_width());

        Rectangle1 r1=new Rectangle1();
        System.out.println("height "+r1.get_height());
        System.out.println("radius "+r1.get_width());
//Practice-5 repeat 1 for circle
       circle1 c = new circle1();
        c.set_radius(5);
       System.out.println("radius "+c.get_radius());


    }
}
