
class mythread extends Thread
{
    public mythread(String name)
    {
        super(name);
    }
    @Override
public void run()
{
    int i=1;
    while(i<10) {
        System.out.println("Thread1 is running");
        i++;
    }

}
}
class mythread5 implements  Runnable
{

    public mythread5(String name)
    {
       // super(name);
        System.out.println("Name of thread is "+name);
    }
    public void run()
    {

        int i=0;
        while(i<5) {
            System.out.println("Thread3 is running");
            i++;
        }
    }
}

public class Java_73_Constructors_From_Thread_class {
    public static void main(String[] args) {
        mythread m=new mythread("Jayanth");
        mythread m1=new mythread("Pavan");
        m.start();
        m1.start();
        System.out.println("Id of the thread is "+m.threadId());
        System.out.println("Name of the thread is "+m.getName());
        System.out.println("Id of the thread is "+m1.threadId());
        System.out.println("Name of the thread is "+m1.getName());
        System.out.println("-------------------------------------------------------");
        mythread5 m2=new mythread5("Jayanth");
        Thread t1=new Thread(m2);
        mythread5 m3=new mythread5("Pavan");
        Thread t2=new Thread(m3);



        System.out.println("Id of the thread is "+t1.threadId());
       // System.out.println("Name of the thread is "+t1.getName());

        System.out.println("Id of the thread is "+t2.threadId());
        //System.out.println("Name of the thread is "+t2.getName());


    }
}
