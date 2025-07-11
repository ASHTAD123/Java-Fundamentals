package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class With_lambda_filter_names {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice","Bob","Andrew");

        List<String> result = names.stream()
                                    .filter(name -> name.startsWith("A"))
                                    .map(name-> name.toUpperCase())
                                    .collect(Collectors.toList());
    
        System.out.println(" Names starting with A : " +result);
     }
}
