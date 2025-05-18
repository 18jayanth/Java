package mypkg.subpkg;
 

public class nestedhello {

     int x=5;
    public int y=6;
    private int z=7;
    protected int u=8;
    public void meth1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(u);
    }
     public void sayNestedHello() {
        System.out.println("Hello from mypkg.subpkg!");
    }

    
}
