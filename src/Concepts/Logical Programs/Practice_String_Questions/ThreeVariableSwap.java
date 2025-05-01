package Practice_String_Questions;
public class ThreeVariableSwap {
 
    public static void main(String[] args) {
        
        int x =100;
        int y = 200;

        System.out.println("Before swap : ");
        System.out.println("x : " +x);
        System.out.println("y : " +y);

        //After swap
        int temp = x;
        x = y;
        y = temp;
    
        System.out.println("After swap : ");
        System.out.println("x : " +x);
        System.out.println("y : " +y);
    }
}
