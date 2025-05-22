package OCA_Prep.Garabage_Collection;

import java.util.ArrayList;
import java.util.List;

public class Finalizer_1 {
 
    private static  List objects = new ArrayList<>();
   
    protected void finalizer(){
        objects.add(this);
        System.out.println("Calling finalizer");
    }

    public static void main(String[] args) {
        
        Finalizer f = new Finalizer();
        
    }
}
}
