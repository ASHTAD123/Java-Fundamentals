package DSA.Recursion;

public class palindrome_string_recursive_method {
    public static void main(String[] args) {
   
        System.out.println(checkPalindromeString(0,"ata"));
       
       }
       static boolean  checkPalindromeString(int i, String input) {

        input = input.toLowerCase();
    
        if(i>=input.length()/2)  return true;

        if (input.charAt(i) != input.charAt(input.length() - i - 1))   return  false;
        

        return checkPalindromeString(i+1,input);
    }
}
