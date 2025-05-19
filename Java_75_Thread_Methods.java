class mythread7 extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("Thread1 is running " + this.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }

    }
}

class mythread8 extends Thread {


    @Override
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("Thread2 is running " + this.getName());
            i++;
        }

    }
}


public class Java_75_Thread_Methods {
    public static void main(String[] args) {
        mythread7 m = new mythread7();
        mythread7 m1 = new mythread7();
        m.start();
        //until m completes m1 wont start
//        try
//        {
//            m.join();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        m1.start();

       mythread8 m2 = new mythread8();
       m2.start();
       mythread8 m3 = new mythread8();
       m3.start();


    }
}
