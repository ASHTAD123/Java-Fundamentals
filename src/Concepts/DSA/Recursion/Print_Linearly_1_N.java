package DSA.Recursion;

public class Print_Linearly_1_N {
    

    public static void printLinerly(int i,int n){

        if(i>n)
            return;

      System.out.println(i);
      printLinerly(i+1, n);
    }
    public static void main(String[] args) {
        
        printLinerly(1,5);
    }
}
