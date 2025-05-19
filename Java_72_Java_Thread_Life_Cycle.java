public class Java_72_Java_Thread_Life_Cycle {
    public static void main(String[] args) {
        /*
  A thread in Java follows a specific life cycle, which describes the various states
  that a thread can go through during its execution.

  Thread Life Cycle States

   New (Born State):
   A thread is in this state when it is created but not yet started.
   The thread object has been created, but the start() method
   has not been called yet.
   Thread t = new Thread();
// Thread is in "New" state


 Runnable (Ready to Run):
When the start() method is invoked, the thread moves to the Runnable state.
The thread is ready for execution but not necessarily running.
The Thread Scheduler decides when the thread will execute.
t.start();  // The thread moves to the "Runnable" state


 Running:
A thread is in the Running state when the thread’s run() method is being executed by the CPU.
The thread transitions from Runnable to Running when the scheduler assigns the CPU to it.
public void run() {
System.out.println("Thread is running.");
 }

Blocked (Waiting for Resources):
A thread moves to the Blocked state when it is waiting for a resource (like I/O or a lock)
 to become available.
It may be blocked for a specific period (timed waiting) or until a resource becomes available.
synchronized (object) {
  // Thread is blocked waiting for the lock on 'object'
        }


Waiting:
A thread is in the Waiting state when it is waiting indefinitely
 for another thread to perform a particular action.
This occurs, for example, when a thread calls the wait() method,
which is typically used in inter-thread communication.
synchronized (object) {
  object.wait();  // The thread is in the "Waiting" state
        }


 Timed Waiting:
A thread enters the Timed Waiting state when it is waiting for a specific period
 of time (using methods like sleep(), join() with a timeout, etc.).
After the specified time, the thread returns to the Runnable state.
Thread.sleep(1000);  // The thread is in "Timed Waiting" state for 1 second


 Terminated (Dead):
A thread enters the Terminated state when its run() method finishes
 or if the thread is interrupted (via interrupt()).
The thread is considered dead and can no longer be started again.
System.out.println("Thread has finished executing.");


        Diagram of Thread Life Cycle:

                +----------------+     +------------+     +----------+
                | New            |---> | Runnable   |---> | Running  |
                +----------------+     +------------+     +----------+
                |                 |                   |
                v                 v                   v
        +------------+     +------------+     +----------+
                | Blocked    |<--- | Waiting    |<--- | Timed    |
                | (Resource) |     | (Indefinite)|     | Waiting  |
                +------------+     +------------+     +----------+
                |
                v
                        +------------+
                | Terminated |
                +------------+
              */
    }
}
