package OCA_Prep.Wrapper_Classes;

public class Problem_2 {
 
    public static void main(String[] args) {
        
        Boolean b = Boolean.valueOf("ASHTAD");//get corressponding wrapper class object

        //get corresponding primitive value
        boolean b1 = b.booleanValue();
        
        System.out.println(b1);
    

        Integer i = new Integer(10);
        int i1 = i.intValue();
        
        System.out.println(i1);
}
}
