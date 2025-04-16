public class Palindrome_two_pointer {

  public static boolean isPalindrome(int x) {
   
    String s = String.valueOf(x);
    int n = s.length()-1;
 
 if(x>=Math.pow(-2,31) && x<=Math.pow(2,31)-1){
        
         for(int i=n; i>=0; i--) {

              for( int j=0; j<=n ; j++){

                 if(s.charAt(i) == s.charAt(j) && i==0){      
                     return true;
                 }else{
                   continue;
                 }
        }
    }
 }
    return false;
}

  public static void main(String[] args) {

    // Input strings
  int p =-121;

    if (isPalindrome(p)) {
      System.out.println("\"" + p + "\" is a palindrome.");
    } else {
      System.out.println("\"" + p + "\" is not palindrome.");
    }
  }
}
