package OCA_Prep.Methods;

public class Overloading {
    

    public static void main(String[] args) {
        
        Overloading overloading = new Overloading();
      //  overloading.fly(10);
        overloading.fly(new Integer(10));
        overloading.fly("numMiles");
        overloading.fly(32121221223.1221212);


    }

    public void fly(int numMiles){
        System.out.println("int type");
    }
    
    // public void fly(double numMiles){
    //     System.out.println("double type");
    // }
    
    public void fly(Integer numMiles){
 System.out.println("Integer type");
    }
    public void fly(short numFeet){
       
    }

     public void fly(int numMiles,short numFeet){
       
    }

     public void fly(short numFeet,int numMiles) throws Exception{
       
    }

    // modifiers doesn't matter , arguments should be different
    // static void fly(short numFeet){

    // }\
    

      //internally var-args is an array
     // void fly(int ...lengths){

    // }

       
        void fly(int[] lengths){
            
        }

        // void fly(String s){
        //     System.out.println("String type");
        // }

         void fly(Object o){
            System.out.println("Object type");
        }




}
