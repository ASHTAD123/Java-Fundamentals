package Concepts.Multi_Threading;

class ThreadStates implements Runnable{

    @Override
    public void run() {
      
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println( "State of thread1 while it called join() method on thread2 -"+ Test_Thread_States.thread1.getState());
    }
}

public class Test_Thread_States implements Runnable{

    public static Thread thread1;
    public static Test_Thread_States test;

    @Override
    public void run() {
        
        ThreadStates threadStates = new ThreadStates();
        Thread thread2 = new Thread(threadStates);

        System.out.println("----------------------------------------------------------------");
        //NEW STATE
        System.out.println("State of Thread 2 after creating it - "+ thread2.getState());
        thread2.start();

        //RUNNABLE STATE
        System.out.println("State of Thread 2 after start() invoked - "+ thread2.getState());
   
        //TIMED WAITING STATE
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            
        }

        System.out.println("State of Thread 2 after calling .sleep() method on it - "+ thread2.getState());

            try{
                thread2.join();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }

            System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState());
        }
    
     

    public static void main(String[] args) {
           
            test =  new Test_Thread_States();
            thread1 = new Thread(test);

      
        System.out.println( "State of Thread 1 after creating it - "+ thread1.getState());
        thread1.start();

        // thread1 moved to Runnable state
        System.out.println( "State of Thread 1 after calling .start() method on it - "+ thread1.getState());

       
    }


  
}
