//sometimes thread  a is running sometimes thread b is running

class mythread1 extends Thread
{ @Override
    public void run()
    {
        int i=1;
        while(i<10) {
            System.out.println("Thread1 is running");
            i++;
        }

    }
}
class mythread2 extends Thread
{ @Override
public void run()
{
    int i=1;
    while(i<10) {
        System.out.println("Thread2 is running");
        i++;
    }

}
}




public class Java_70_Creation_of_Thread_by_Thread_class {
    public static void main(String[] args) {
        mythread1 m1=new mythread1();
        mythread2 m2=new mythread2();
        m1.start();
        m2.start();

    }
}
