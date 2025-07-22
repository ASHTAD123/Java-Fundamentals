package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_6 {
    
    public static void main(String[] args) {
        
      
        String s = new String("ashtad");

        String y = "ashtad";
         //here it creates one string in SCP and one in heap object so both are diff in memory
       
        System.out.println(s==y);
    }
}
