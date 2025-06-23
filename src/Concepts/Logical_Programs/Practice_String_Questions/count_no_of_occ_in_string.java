package Practice_String_Questions;
public class count_no_of_occ_in_string {
    
    public static void main(String[] args) {
        
        String s = "Hello";
        Character c= 'l';
        int count = 0;

        if(s!=null){
          
            for(int i=0; i<s.length()-1; i++){

                if(s.charAt(i)==c){
                    count++;
                }
            }
        }

        System.out.println("No of occurences : " +count);
    }
}
