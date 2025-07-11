package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class example_sort_lambda {
 
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("John","Alexandar","Amy","Zoe");

        Collections.sort(names,(e1,e2) -> Integer.compare(e1.length(), e2.length()));

        System.out.println("Names sorted by length :" +names);

        
    }
}
