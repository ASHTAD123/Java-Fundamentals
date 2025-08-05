package Try_Catch_Examples;

//Control flow in try-catch
// Exception occurs in try block and handled in catch block
class TryCatchExample {

   public static void main(String[] args) {
   
    int[] arr = new int[4];

    try{
        //exception is thrown at this line
        int i = arr[4];
       
        System.out.println("Inside the try block");
    
    }catch(ArrayIndexOutOfBoundsException ex){
        System.out.println("Caught an ArrayIndexOutOfBoundsException");
    }
    
    System.out.println("Rest of the program");
   }
}