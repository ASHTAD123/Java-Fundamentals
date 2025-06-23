package DSA.Basic_Math_Problems;

public class CountNumberOfDigits {
       
        public static void main(String[] args) {
            CountNumberOfDigits obj = new CountNumberOfDigits();
            int n = 1212;
            int result = obj.countDigit(n);
            System.out.println("The number of digits in " + n + " is: " + result);
        }
      
        public int countDigit(int n) {
            int count =0;
            
            if(n==0) return 1;
                
            n = Math.abs(n);  // Handle negative numbers
          
            while(n>0){
            //    int lastDigit = n % 10;
                n = n / 10;
                count++;
                System.out.println(n);
            }
    
            return count;
        }
    
}
