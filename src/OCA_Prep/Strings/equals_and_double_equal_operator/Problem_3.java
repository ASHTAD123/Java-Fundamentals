package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_3 {
 
    public static void main(String[] args) {
        
        String a = new String("A");
        String b = new String("A");

        System.out.println(a==b);//false
        System.out.println(a.equals(b));//true because this () is overriden in String class for content comparision
    }
}
