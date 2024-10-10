//Control flow in try-catch-finally 

class TryCatchExample {

    // a statement in try block raised an exception, then the rest of the try block
    // doesn’t
    // execute and control passes to the corresponding catch block.
    // After executing the catch block, the control will be transferred to finally
    // block(if present) and then the rest program will be executed.

   public static void main(String[] args) {
   
    int[] arr = new int[4];

    try{
        //exception is thrown at this line
        int i = arr[4];
       
        System.out.println("Inside the catch block");
    
    }catch(ArrayIndexOutOfBoundsException ex){
        System.out.println("Caught an ArrayIndexOutOfBoundsException");
    }
    finally{
        System.out.println("Inside the finally block");
    }
    System.out.println("Rest of the program");
   }
}