//Control flow in try-catch when exception is not handeled properly
class TryCatchExample1 {

   public static void main(String[] args) {
   
    int[] arr = new int[4];

    try{
        int i = arr[4];
        System.out.println("Inside the try block");
    
    }catch(NullPointerException  ex){
        System.out.println("Caught an NullPointerException ");
    }
    System.out.println("Rest of the program");
   }
}