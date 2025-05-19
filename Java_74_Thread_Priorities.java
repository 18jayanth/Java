class mythread6 extends Thread
{
    public mythread6(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        int i=1;
        while(i<5) {
            System.out.println("Thread is running "+this.getName());
            i++;
        }

    }
}



public class Java_74_Thread_Priorities {
    public static void main(String[] args) {
        //but moostly priorities decided by os but java has little to do in this matter
        mythread6 m=new mythread6("Jayanth");
        mythread6 m1=new mythread6("Jayanth1");
        mythread6 m2=new mythread6("Jayanth2");
        mythread6 m3=new mythread6("Jayanth3");
        mythread6 m4=new mythread6("Jayanth4");
        m4.setPriority(Thread.MAX_PRIORITY);
        m.setPriority(Thread.MIN_PRIORITY);
        m.start();
        m1.start();
        m2.start();
        m3.start();
        m4.start();


    }
}
