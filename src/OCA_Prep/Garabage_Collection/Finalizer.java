package OCA_Prep.Garabage_Collection;

public class Finalizer {
 
    protected void finalize(){
        System.out.println("Calling finalizer");
    }

    public static void main(String[] args) {
        
        Finalizer f = new Finalizer();

    }
}
