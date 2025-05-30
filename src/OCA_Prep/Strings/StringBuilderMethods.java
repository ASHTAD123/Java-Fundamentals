package OCA_Prep.Strings;

public class StringBuilderMethods {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("animals");

        String sub = sb.substring(sb.indexOf("a"),sb.indexOf("al"));

        int len = sb.length();
        char ch = sb.charAt(6);

        System.out.println(sub + " " + len + " " + ch);

        //append()
        StringBuilder sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1);

    
        //insert()
        //insert(int offset,String str)
        StringBuilder sb2 = new StringBuilder("animals");
        sb2.insert(7, "-");
        sb2.insert(0, "-");
        sb2.insert(4, "-");
        System.out.println(sb2);

        //delete 
        //delete(start,end)
        //deleteCharAt(int index)
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.delete(1,3);
        // sb3.deleteCharAt(5);//exception
        System.out.println(sb3);






    }
}
