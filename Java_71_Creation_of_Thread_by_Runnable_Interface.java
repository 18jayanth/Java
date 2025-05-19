class mythread3 implements  Runnable
{
public void run()
{

    int i=0;
    while(i<5) {
    System.out.println("Thread3 is running");
    i++;
}
}
}
class mythread4 implements  Runnable
{
    public void run()
    {   int i=0;
        while(i<5) {
            System.out.println("Thread4 is running");
            i++;
        }
    }
}




public class Java_71_Creation_of_Thread_by_Runnable_Interface {
    public static void main(String[] args) {
        mythread3 m=new mythread3();
        Thread t1=new Thread(m);
        mythread4 m1=new mythread4();
        Thread t2=new Thread(m1);
        t1.run();
        t2.run();


    }
}
