public class ReverseString {
    
    public static void main(String[] args) {
        
        String str = "123";
        
        System.out.println(reverseString(str));
    }

    public static String reverseString(String input){

        if(input==null){
            throw new IllegalArgumentException("You have given null value ");
        }

        StringBuilder out = new StringBuilder();

        char[] chars = input.toCharArray();

        for(int i=chars.length-1; i >=0 ; i--){
            out.append(chars[i]);
        }

        return out.toString();
    }
}
