public class CountNumberOfDigits {
       
        public static void main(String[] args) {
            CountNumberOfDigits obj = new CountNumberOfDigits();
            int n = 1;
            int result = obj.countDigit(n);
            System.out.println("The number of digits in " + n + " is: " + result);
        }
        public int countDigit(int n) {
            int count =0;
            while(n>0){
            //    int lastDigit = n % 10;
                count++;
                n = n / 10;
            }
    
            return count;
        }
    
}
