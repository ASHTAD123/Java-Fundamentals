public class ReverseNumber {
    
    public static void main(String[] args) {
        
        int number=432;
        int reverseNumber=0;

        while(number!=0){
             
            //get last digit from num
            int digit = number % 10; // 112 % 10 = 2; // 11 % 10 =1  // 1 % 10 = 1

            reverseNumber = reverseNumber * 10 +digit; // 0 *10 + 2 =2  // 2*10+1 =21 // 21 * 10 + = 211

            number =  number / 10; // 11 // 1
        }
        System.out.println("Reversed Number: " + reverseNumber);
    }
}
