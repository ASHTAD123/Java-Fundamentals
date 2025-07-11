package Interview_questions;

class find_first_non_repeating_char {
  

    static char nonRepeatingChar(String s) {
        
        int n = s.length();

        //loop through the string
        for (int i = 0; i < n; i++) {
        
            boolean found = false;

            for (int j = 0; j < n; j++) {
                
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found == false) 
                return s.charAt(i);
        }

        return '$';
    }

    public static void main(String[] args) {
        String s = "RacEcaR";
      
        System.out.println(nonRepeatingChar(s));
    }
}
