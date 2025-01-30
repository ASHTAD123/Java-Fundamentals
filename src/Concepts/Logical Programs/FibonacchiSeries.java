public  class FibonacchiSeries {
    
    //function to N FibonacchiSeries
    static void Fibonacchi(int n){
        
        int num1=0;
        int num2=1;

        for(int i=0; i<n ; i++){

            System.out.println(num1); //0 1 1 2

            //swap
            int nextTerm = num1 + num2;//0+1=1  1+1=2  1+2=3
            num1 = num2; //1 1 2
            num2 = nextTerm;//1; 2 3
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
