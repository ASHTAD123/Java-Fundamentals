public class TryFinallyExample {

    public static void main (String[] args) 
    {
         
        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        finally
        {
            System.out.println("finally block executed");
        }
         
        // rest program will not execute
        System.out.println("Outside try-finally clause");
    }
}
