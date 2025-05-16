interface parent1
{
    void meth1();
    void meth2();

}
interface child5 extends parent1
{
    void meth3();
    void meth4();
}
class child6 implements child5{
    public void meth3()
    {
        System.out.println("method3 loading");
    }
    public void meth4()
    {
        System.out.println("method4 loading");
    }
    public void meth2()
    {
        System.out.println("method2 loading");
    }
    public void meth1()
    {
        System.out.println("method1 loading");
    }
}
public class Java_58_Inheritanace_in_Java {
    public static void main(String[] args) {
        child6 c=new child6() ;
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();





    }
}
