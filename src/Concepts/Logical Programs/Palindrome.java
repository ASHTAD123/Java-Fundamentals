public class Palindrome {
   
   public static void main(String[] args) {
   
    checkPalindromeString("ABADSA");
   
   }
   static boolean  checkPalindromeString(String input) {
	
    boolean result = true;
	int length = input.length();
    int half = length /2;

    for (int i = 0; i < half; i++) {
	
        if (input.charAt(i) != input.charAt(length - i - 1)) {
			result = false;
			break;
		}
	}

	return result;
}
}
