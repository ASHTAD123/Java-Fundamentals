package Try_Catch_Finally_Examples;

public class Try_Catch_Finally_Example2 {
    public static void main(String[] args) {
    
        int[] arr = new int[4];
    
        try{
            int i = arr[4];
            System.out.println("Inside the catch block");
        
        }catch(NullPointerException ex){
            System.out.println("Caught an NullPointerException");
        }finally{
           System.out.println("Finally block executed");
        }
        
        System.out.println("Rest of the program");
       }
}
