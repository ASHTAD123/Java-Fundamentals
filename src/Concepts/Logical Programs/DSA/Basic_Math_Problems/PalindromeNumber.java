public class PalindromeNumber {
  public static boolean isPalindrome(int x) {

    int revNum = 0;

    int dup = x;

    while (x > 0) {
      int ld = x % 10;
      revNum = (revNum * 10) + ld;
      x = x / 10;
    }

    if(dup == revNum) 
       return true;

    return false;
  }

  public static void main(String[] args) {
    
   System.out.println( isPalindrome(122));
  }
}
