import mypkg.hello;
import mypkg.subpkg.nestedhello;
class c3 extends nestedhello{
    void meth2()
    {
        //in different package and subclass default and private cannot access
        //System.out.println(x);
        System.out.println(y);
       // System.out.println(z);
        System.out.println(u);
    }

}
public class main {
    public static void main (String[] args) {
        hello h = new hello();
        h.sayHello();

        nestedhello nh = new nestedhello();
        nh.sayNestedHello();
        nh.meth1();// all values
        //different package only public can access
       // System.out.println(nh.x);
        System.out.println(nh.y);
        //System.out.println(nh.z);
        //System.out.println(nh.u);
    }
}