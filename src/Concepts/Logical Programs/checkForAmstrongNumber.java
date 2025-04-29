public class checkForAmstrongNumber {
    
    public static void main(String[] args) {
     
       System.out.println(isAmstrongNumber(371));
    }

    public static boolean isAmstrongNumber(int number){
     
        int k = String.valueOf(number).length();

        int sum = 0;

        int n = number;

        while(n>0){

            int ld = n % 10;

            sum += Math.pow(ld, k);

            n = n / 10;
        }

        return sum == number ? true : false;
    }
}
