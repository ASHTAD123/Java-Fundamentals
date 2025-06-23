package Practice_String_Questions;
public class Strings_equality {

    public static void main(String[] args) {
        
        String a="ashu";
        String b="ash7";

        boolean check = false;

        for(int i=0 ; i< a.length() ; i++){
        
            if (a.charAt(i) != b.charAt(i)) {
                check=false;        
              System.out.println("INSIDE " );

            }else{
              check=true;  

            }
        }
        System.out.println("Strings are equal : " +check);
    }
}
