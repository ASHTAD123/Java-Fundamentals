public class CountNumberOfDigits_Optimal_Approach {
    

    public static int countDigit(int n){

        int count =(int) (Math.log10(n)+1);
          // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.

        // Adding 1 to the result accounts
        // for the case when 'n' is a power of 10,
        // ensuring that the count is correct.

        // Finally, the result is cast
        // to an integer to ensure it is rounded
        // down to the nearest whole number.

        // Return the count of digits in 'n'.
        return count;
    }

    public static void main(String[] args) {
        int number = 1234567890;
        int count = countDigit(number);
        System.out.println("Number of digits in " + number + " is: " + count);
    }

}
