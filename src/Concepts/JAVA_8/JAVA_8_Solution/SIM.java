/*
 * DEFAULT METHODS JAVA 8
 * 
 * SOLVES ISSUE WHICH WAS UPTO JAVA 1.7
 * 
 * BY USING DEFAULT METHODS 
 * 
 */
package Concepts.JAVA_8.JAVA_8_Solution;

public interface SIM {
    
    void call();

    void message();

    public default void videoCall(){
        System.out.println("Video call from SIM Interface");
    }
}
class Airtel  implements SIM {

    @Override
    public void call() {
      System.out.println("Airtel call functionality ");
    }
    @Override
    public void message() {
        System.out.println("Airtel message functionality ");
    }
    
    //Here its optional to implement video call functionality which makes it easy 
    //for extending the functionality as when as needed
    //Also it does not disturbs existing functionality of sub classes
}
class Mobile{

    void insertSIM(SIM sim){
        sim.call();
        sim.message();
        sim.videoCall();
    
    }
}
class Customer {

    public static void main(String[] args) {
        
        Mobile mobile = new Mobile();
        mobile.insertSIM(new Airtel());
    }
}