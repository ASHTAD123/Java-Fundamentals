package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_4 {
 
    public static void main(String[] args) {
        
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("A");

        System.out.println(a==b);//false
        System.out.println(a.equals(b));//false 
        
        // 1. last line false because StringBuffer and StringBuilder dsnt override .equals method for content comparision
        // 2. all wrapper classes , collections , string class override .equals() for content comparsion except Sbuff and Sbuilder
    }
}
