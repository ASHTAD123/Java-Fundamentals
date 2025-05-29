package OCA_Prep.Strings;

public class exmaple_1 {
    
    public static void main(String[] args) {
        
        //length()
        String s ="Ashtad";
        System.out.println(s.length());//6

        //charAt()
        s="Animals";
        System.out.println("--------charAt() examples----------");
        System.out.println("Char at pos 0 :" + s.charAt(0));//A
        System.out.println("Char at pos 5 :" + s.charAt(5));//s
        System.out.println();


        //indexOf()
        System.out.println("--------indexOf() examples----------");
        System.out.println("Index of 'a' :" + s.indexOf('a'));//-1
        System.out.println("Index of 'ni' :"+ s.indexOf("ni"));//1
        System.out.println("Index of 'ni' :"+ s.indexOf("ni : start=0",0));//1
        System.out.println("Index of 'ni' :"+ s.indexOf("ni: start=2",2));//-1
        System.out.println();


        //subString()
        System.out.println("----------subString() examples-----------");
        System.out.println("Substring from index 3: " + s.substring(3));//mals
        System.out.println("Substring from index 3: " + s.substring(s.indexOf('m')));
        System.out.println();


        System.out.println("Substring from index 3 to 5(exclusive): " + s.substring(3,5));//ma
        System.out.println("Substring from index 3 to 4(exclusive): " + s.substring(3,4));//m
        System.out.println("Substring from index 3 to 3(exclusive): " + s.substring(3,3));//blank
        // System.out.println("Substring from index 3 to 2(exclusive): " + s.substring(3,2));//exception
        // System.out.println("Substring from index 3 to 8(exclusive): " + s.substring(3,8));//exception
    
    
        s.toUpperCase();

        System.out.println(s);//lowercase

     
        //equals[characters and case should be same] and equalsIgnoreCase()[only characters should be same]
        System.out.println("----------equals() Examples-----------");
        System.out.println("Abc".equals("ABC"));//false
        System.out.println("ABC".equals("ABC"));//true
        System.out.println("abc".equalsIgnoreCase("ABC"));//true
        System.out.println();

        
        //startsWith[case should match] & endsWith[case should match]

        System.out.println("---------startsWith() and endsWith Examples ----------");
        System.out.println(s.startsWith("An"));
        System.out.println(s.startsWith("an"));
        System.out.println(s.endsWith("Ls"));
        System.out.println(s.endsWith("ls"));
        System.out.println();


         System.out.println("---------contains() and endsWith Examples ----------"); //CASE SENSITIVE
         System.out.println(s.contains("AN"));
         System.out.println(s.contains("An"));
    }
}
