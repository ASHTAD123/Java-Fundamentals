package Concepts.JAVA_8.Before_Java_8_problem;

/*
 * Problem upto Java 1.7
 */
interface SIM {
    
    public abstract void call();
    public abstract void sms();

    //All sub-classes are forced to implement it
    // public abstract void videoCall();
}

interface SIM3G{

    void videoCall();
}


class Airtel  implements SIM {

    @Override
    public void call() {
      System.out.println("Airtel call functionality ");
    }

    @Override
    public void sms() {
     System.out.println(" SMS functionality");
    }
    
}
class Mobile{

    void insert(SIM sim){
        sim.call();
        sim.sms();

        //unable to call because Airtel class cannot support video call
        //sim.videoCall();
    }
}

class Customer {

    public static void main(String[] args) {
        
        Mobile mobile = new Mobile();
        mobile.insert(new Airtel());
    }
}

class Aitel3G extends Airtel implements SIM3G{

    @Override
    public void videoCall() {
     System.out.println("SIM 3G video call");
    }

}