package Concepts.Multi_Threading;

public class ThreadClassExample extends Thread {


    @Override
    public void run() {
        System.out.println(" Run method overrriden from Thread Class " );
        for(int i = 0; i<=10 ; i++) {
            System.out.print(i);
        } 
        System.out.println();
        for(int i = 0; i<=10 ; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadClassExample threadExm = new ThreadClassExample();
        threadExm.start();
    }
}
