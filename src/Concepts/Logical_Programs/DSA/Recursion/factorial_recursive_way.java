package DSA.Recursion;

public class factorial_recursive_way {
    
  
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int i){

        if(i==0)
            return 0;

         return i +factorial(i-1)   ;
    }
}
