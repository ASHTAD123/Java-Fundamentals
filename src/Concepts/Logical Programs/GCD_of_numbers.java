public class GCD_of_numbers {
    
  public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGCD(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
    public static int findGCD(int n1, int n2){

        int gcd=1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            
            if(n1 % i ==0 && n2 % i ==0){

                gcd = i;
            }
        }

        return gcd;
    }
}
