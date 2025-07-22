package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_9 {
    
    public static void main(String[] args) {
        
        String s1 = new String("Ashtad");
        String s2 = s1.toLowerCase();//creates new object
        String s3 = s1.toLowerCase();//creates new object
        
        System.out.println( s2 == s3);
    }
}
