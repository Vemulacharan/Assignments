package Threads;
class MyThreadd extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is performing the task.");
    }
}

public class MyThreadGroup {
    public static void main(String[] args) {
        
        ThreadGroup myThreadGroup = new ThreadGroup("Thread Groups");

       
        Thread t1 = new Thread(myThreadGroup, new MyThreadd(), "Thread 1");
        Thread t2 = new Thread(myThreadGroup, new MyThreadd(), "Thread 2");
        Thread t3 = new Thread(myThreadGroup, new MyThreadd(), "Thread 3");

        
        t1.start();
        t2.start();
        t3.start();
        myThreadGroup.list();
        
        System.out.println("Thread Group Name: " + myThreadGroup.getName());
        System.out.println("Active Threads Count: " + myThreadGroup.activeCount());

        Thread[] threads = new Thread[myThreadGroup.activeCount()];
        myThreadGroup.enumerate(threads);

        System.out.println("Threads in the Thread Group:");
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }
    }
}
