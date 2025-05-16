class a
{
    public void horn()
    {
        System.out.println("horning in class a");
    }
}
class b extends  a
{
    public void horn()
    {
        System.out.println("horning in class b");
    }

}
class c extends  a
{
    public void horn()
    {
        System.out.println("horning in class c");
    }

}//error u cannot extend multiple clases so multiple inheritance not possible
//class d extends  a,b
//{
//    public void horn()
//    {
//        System.out.println("horning in class c");
//    }
//
//}
interface a1
{
    void show();
}
interface b1
{
    void show();
}
class c1 implements a1,b1
{
    public void show()
    {
        System.out.println("i am showing");
    }
}





public class Java_56_multiple_inheritance_not_supported_in_Java {
    public static void main(String[] args) {
        c1 c=new c1();
        c.show();
    }
}
