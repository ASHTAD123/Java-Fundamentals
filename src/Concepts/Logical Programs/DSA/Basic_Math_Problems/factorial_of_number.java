package DSA.Basic_Math_Problems;


public class factorial_of_number {
    
    static int factorial(int x){

        int ans =1;

        for(int i=1; i<=x; i++){
            ans = ans * i;
        }
        return  ans;
    }

    public static void main(String[] args) {
        
        int x=5;
        int result = factorial(x);
        System.out.println("Factorial of "+x+" is "+result);
    }
}
