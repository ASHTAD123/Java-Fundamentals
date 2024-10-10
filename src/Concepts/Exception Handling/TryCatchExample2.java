public class TryCatchExample2 {
    public static void main(String[] args) {
        try
        {
             
            String str = "123";
                 
            int num = Integer.parseInt(str);
                 
            // this statement will execute
            // as no any exception is raised by above statement
            System.out.println("Inside try block");
             
        }
         
        catch(NumberFormatException ex)
        {
            
            //When there is no exception thrown ,catch block will not be executed
            System.out.println("catch block executed...");
                 
        }
 
        System.out.println("Outside try-catch clause");
    }
}
