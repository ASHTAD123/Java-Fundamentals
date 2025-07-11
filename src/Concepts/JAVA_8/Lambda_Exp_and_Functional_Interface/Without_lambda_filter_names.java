package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Without_lambda_filter_names {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice","Bob","Andrew","keth");

        List<String> result = new ArrayList<>();

        for(String name:names){

            if(name.startsWith("A"))
                result.add(name.toUpperCase());
        }

        System.out.println("Names starting with A :"+result);
    }
}
