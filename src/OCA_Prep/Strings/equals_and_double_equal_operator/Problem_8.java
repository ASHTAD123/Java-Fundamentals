package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_8 {
    
    public static void main(String[] args) {
        
        String a = "ashtad";
        String b = "ashtad";

        //both objects are pointing to same location in SCP area 
        // no new string is created in SCP 
        System.out.println(a==b);
    }
}
