class base
{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Java_45_Inheritance_In_Java {
    public static void main(String[] args) {
        //creating base obj to call x
        base b=new base();
        b.setX(3);
        System.out.println(b.getX());

        //creating derived obj to call x
        derived d=new derived();
        d.setX(5);
        System.out.println(d.getX());
        System.out.println(d.getY());

        //creating derived obj to call y
        derived d1=new derived();
        d1.setY(5);
        System.out.println(d1.getY());

        //creating derived obj to call y
       // error
//        base b1=new base();
//        b1.setY(5);
//        System.out.println(b1.getY());

    }
}
