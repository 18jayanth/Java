class c2
{
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

}






public class Java_66_Access_Modifiers {
    public static void main(String[] args) {
        c2 c=new c2();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        //System.out.println(c.z); java: z has private access in c2
        System.out.println(c.u);

    }
}
