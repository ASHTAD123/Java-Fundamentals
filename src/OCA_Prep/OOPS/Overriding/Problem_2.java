package OCA_Prep.OOPS.Overriding;

public class Problem_2 {
    
    private void m1(){

    }
    public static void main(String[] args) {
        
    }
}

class Problem_3 extends Problem_2{
    
    //allows but not overriden
    //private methods of parent class are not visible to child class
    private void m1(){
        
    }
    public static void main(String[] args) {
        
    }
}

