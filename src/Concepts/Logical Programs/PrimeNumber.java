public class PrimeNumber {
    
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


    // Driver Program
    public static void main(String args[]){

                 int N = 100; 
            System.out.println(isPrime(11));

            System.out.println(isPrime(15));

            for(int i=1; i<=N; i++){
               
                if(isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
 

    }
}
