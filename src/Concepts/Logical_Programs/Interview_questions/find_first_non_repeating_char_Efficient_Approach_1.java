package Interview_questions;

public class find_first_non_repeating_char_Efficient_Approach_1 {
       

        public static Character nonRepChar(String s){

            int sizeOfArr =26;
            
            int[] arr = new int[sizeOfArr];

            for(char c : s.toCharArray()){

                arr[c -'a']++;
            }

            for(char c : s.toCharArray()){

                if(arr[c-'a']==2){
                    return c;
                }
            }

            return '$';
        }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRepChar(s));
    }
}
