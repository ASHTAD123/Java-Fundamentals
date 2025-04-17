public class checkForAmstrongNumber {
    
    public static void main(String[] args) {
     
       System.out.println(isAmstrongNumber(372));
    }

    public static boolean isAmstrongNumber(int number){
     
        int rev =0;
        int sum=0;
        int original = number;
        
        while(number!=0){

            int digit = number % 10; //last digit

            sum = sum + (digit*digit*digit);

         number = number / 10; //number leftover after removing last digit
        }

        if (original==sum) {
            return true;
        }
        return false;
    }
}
