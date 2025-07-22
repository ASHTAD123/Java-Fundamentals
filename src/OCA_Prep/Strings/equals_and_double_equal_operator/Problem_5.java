package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_5 {
    
    public static void main(String[] args) {
        
      
        String s = new String("ashtad");
         s = "ashtad";

        String y = "ashtad";
        
        //here 's' starts pointing to literal in SCP area and y also points to same
        System.out.println(s==y);
    }
}
