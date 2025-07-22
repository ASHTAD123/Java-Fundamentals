package OCA_Prep.Wrapper_Classes;

public class Problem_1 {
    
    public static void main(String[] args) {
        
        Boolean a = new Boolean("A");
        Boolean b = new Boolean("B");

        System.out.println(a==b);
 
        System.out.println(a.equals(b));//internally both objetcs have false as value
    }
}
