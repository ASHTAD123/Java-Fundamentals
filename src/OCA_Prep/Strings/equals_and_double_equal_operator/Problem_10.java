package OCA_Prep.Strings.equals_and_double_equal_operator;

public class Problem_10 {
    
    public static void main(String[] args) {
        
        byte[] b = {100,101,102,103};
        String s = new String(b);
        System.out.println(s);

        char[] c1 = {'a','b'};
        String c = new String(c1);
        System.out.println(c);

        StringBuffer sb1 = new StringBuffer();
        sb1.append("ashtad");

        String sb = new String(sb1);
        String a ="ashtad";

        sb.concat("sb");
        System.out.println(sb);

        System.out.println(sb==a);
    }
}
