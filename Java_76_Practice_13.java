class mythread9 extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Good Morning");
            System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
            //Practice-5
            //how to get refernce of current thread in java Thread.currentthread
            System.out.println("Name of Current Thread is "+Thread.currentThread().getName() );
            i++;
        }


    }
}
class mythread10 extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome");
            System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
            System.out.println("Name of Current Thread is "+Thread.currentThread().getName() );
            i++;
        }


    }
}




public class Java_76_Practice_13 {
    public static void main(String[] args) {
        //Practice-1
        //write a program to print "good morning" "welcome" continuously
        //on the screen with java using threads
        mythread9 m1=new mythread9();
        mythread10 m2=new mythread10();
        //Practice-2
        //add a sleep method in welcome message  wth 200ms
        //Practice-3
        //Demonstrate get and set priority threads in java
        System.out.println("The priority of m1 is "+m1.getPriority());
        System.out.println("The priority of m2 is "+m2.getPriority());
        m1.setPriority(6);
        m2.setPriority(9);
        System.out.println("The priority of m1 is "+m1.getPriority());
        System.out.println("The priority of m2 is "+m2.getPriority());


        m1.start();
        m2.start();
        //Practice-4
        //how to get state of given thread in java
        Thread.State state = m1.getState();
        System.out.println("Thread state: " + state);
        Thread.State state1 = m2.getState();
        System.out.println("Thread state: " + state1);



    }
}
