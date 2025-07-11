package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class NameCompator_with_lambda{

   public static void main(String[] args) {
    
        List<String> names = Arrays.asList("JKAS","sSDSD","asbc");

        //here we didn't require to create a separate class
        
        Collections.sort(names, (a,b) -> a.compareTo(b));

        System.out.println(names);
   }
}