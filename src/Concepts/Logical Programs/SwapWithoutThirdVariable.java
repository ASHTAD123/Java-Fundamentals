public class SwapWithoutThirdVariable {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
    
        System.out.println("a is " + a + " and b is " + b);

        a = a + b;   // 30 =10+20
        b = a - b;  // 10 = 20-10
        a = a - b; //  20 = 30 - 10

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }
}
