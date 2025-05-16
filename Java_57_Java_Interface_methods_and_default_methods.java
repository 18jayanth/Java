interface camera
{
void takesnap();
void recordvideo();
//private method is used to reduce some load on default method
private void wishing()
{
    System.out.println("good morning");
}
default void  snapchat()
{     wishing();
    System.out.println("i am using snapchat");
}
}
interface wifi
{
    String[] getnetworks();
    void connnecttonetwork(String network);

}
class mycellphone
{
    void cellnumber(int phonenumber)
    {
        System.out.println("calling number "+phonenumber);
    }
    void picking()
    {
        System.out.println("picking....");
    }
}

class mysmartphone extends mycellphone implements wifi,camera
{
    public void takesnap()
    {
        System.out.println("take snap");
    }
    public void recordvideo()
    {
        System.out.println("take snap");
    }
    public String[] getnetworks()
    {
        System.out.println("getting network");
        String[] s={"Pavan","ajay"};
        return s;
    }
    public void connnecttonetwork(String s)
    {
        System.out.println("connecting "+s);
    }
    //overding parent interface default method
//    public void  snapchat()
//    {
//        System.out.println("i am using snapchat pro");
//    }
}
public class Java_57_Java_Interface_methods_and_default_methods {
    public static void main(String[] args) {
        mysmartphone m=new mysmartphone();
        String[] ar=m.getnetworks();
        for(String i:ar)
        {
            System.out.println(i);
        }
        m.connnecttonetwork("Jayanth");
        m.takesnap();
        m.recordvideo();
        m.picking();;
        m.cellnumber(12345678);
        m.snapchat();



    }
}
