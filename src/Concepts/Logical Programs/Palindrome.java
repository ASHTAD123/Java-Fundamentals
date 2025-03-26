public class Palindrome {
   
   public static void main(String[] args) {
   
    System.out.println(checkPalindromeString("ABADSA"));
   
   }
   static boolean  checkPalindromeString(String input) {
	
    boolean result = true;
	int length = input.length();
    input = input.toLowerCase();

    int half = length /2;
   
    for (int i = 0; i < half; i++) {
	
        //A !=A
        if (input.charAt(i) != input.charAt(length - i - 1)) {
			result = false;
			break;
		}
	}

	return result;
}
}
