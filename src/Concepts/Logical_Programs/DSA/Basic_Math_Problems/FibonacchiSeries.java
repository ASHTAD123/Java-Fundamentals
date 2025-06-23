package DSA.Basic_Math_Problems;

public  class FibonacchiSeries {
    
    //function to N FibonacchiSeries
    static void Fibonacchi(int n){
        
        int prevTerm=0;
        int nextTerm=1;

        for(int i=0; i<n ; i++){

            System.out.println(prevTerm); //0 1 1 2

            //swap
            int sum = prevTerm + nextTerm;//0+1=1  1+1=2  1+2=3
            prevTerm = nextTerm; //1 1 2
            nextTerm = sum;//1; 2 3
        }
    
    }

     // Driver Code
     public static void main(String args[])
     {
         // Given Number N
         int N = 10;
 
         // Function Call
         Fibonacchi(N);
     }
}
