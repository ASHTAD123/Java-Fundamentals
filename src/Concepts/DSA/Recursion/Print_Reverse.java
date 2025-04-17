package DSA.Recursion;

public class Print_Reverse {
    
      
    public static void reverse(int i , int n){

        if(i<n)
            return;

        System.out.println(i);

        reverse(i-1, n);
    }

    public static void main(String[] args) {
        
      reverse(5, 1);
    }
}
