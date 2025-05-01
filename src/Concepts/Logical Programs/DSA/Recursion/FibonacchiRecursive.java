package DSA.Recursion;
public class FibonacchiRecursive {
    
    static long fibonaachi(int input){

        //Base case    
        if(input <=1){
            return input;
        }

        long[] fibonaachiChace;
        fibonaachiChace = new long[input+1];
        
        //return fibonaachi(input -1)+(input-2);

        if(fibonaachiChace[input] !=0){
            return fibonaachiChace[input];
        }
        long nthFibo =  (fibonaachi(input -1)+(input-2) );
   
        fibonaachiChace[input] = nthFibo;

         return nthFibo;
    }

    public static void main(String[] args) {
        
        int n = 600;
 
        for(int i=0 ; i<n ; i++){
            System.out.println(fibonaachi(i)+ " ");
        }
        System.out.println();
    }
}
