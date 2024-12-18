package Type_Of_Exceptions;
public class NumberFormatExceptionExample {
    
    public static void main(String[] args) {
        
        try{
             int num = Integer.parseInt("ash");
             System.out.println(num);
         }catch(Exception e){
             System.out.println("NumberFormatException");
         }
    }
}
