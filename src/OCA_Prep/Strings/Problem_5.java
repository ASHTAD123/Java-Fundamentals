package OCA_Prep.Strings;

public class Problem_5 {
    
    public static void main(String[] args) {
        
        String s = new String("ASHTAD");

        //on all runtime operations new object is created in heap
        s.concat("Software");
        s.concat("Software");
        s.toLowerCase();
        s.toUpperCase();

        System.out.println(s);
    }
}
