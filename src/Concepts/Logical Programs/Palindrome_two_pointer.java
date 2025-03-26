public class Palindrome_two_pointer {
    
    public static boolean isPalindrome(String s) {
    
    int i=0;
    int j =s.length()-1;

    while(i<j){
       
        if(s.charAt(i) !=s.charAt(j)){
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
      
    // Input strings
    String s1 = "aba";
    s1 = s1.toLowerCase();

    if(isPalindrome(s1)){
        System.out.println("\"" + s1 + "\" is a palindrome.");
    }else{
        System.out.println("\"" + s1 + "\" is not palindrome.");
    }
    
}
}
