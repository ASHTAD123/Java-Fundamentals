package OCA_Prep.Strings;


public class EqualityOperator {
    
    public static void main(String[] args) {
        
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");

        System.out.println(one==two);//false
        System.out.println(one==three);//true


        String a ="A";
        String b="A";
        System.out.println(a==b);//true;
        
        String s = new String("a");
        String s1 = new String("a");

        System.out.println(s==s1);//false

        //tricky
        String x1="Ash";
        String x2=" Ash".trim(); //new String is created on compile time    
        System.out.println(x1==x2);//false

        String x3 = new String("HELLO");
        String x33 = "HELLO";
        System.out.println(x3==x33);

        //the lesson is to never use == to compare String objects , instead use equals() or equalsIgnoreCase() function
    }
}
