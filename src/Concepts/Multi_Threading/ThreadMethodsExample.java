package Concepts.Multi_Threading;

import java.util.HashMap;
import java.util.Map;

public class ThreadMethodsExample extends Thread{

    @Override
    public void run() {
        
        System.out.println("Thread class run()");
    }

    public static void main(String[] args) {
        
        ThreadMethodsExample thread = new ThreadMethodsExample();
        thread.start();

        System.out.println("Thread is alive: " + thread.isAlive());

        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Thread id : "+thread.getId());
        System.out.println("Thread name : "+thread.getName());

        System.out.println("Active threads:" +thread.activeCount());
        System.out.println("Current thread reference :" + thread.currentThread());
        System.out.println(" Stack Trace of thread :");
        thread.dumpStack();

        System.out.println("Is interrupted :" +thread.isInterrupted());
        System.out.println("Thread is alive: " + thread.isAlive());
 
    }


}
