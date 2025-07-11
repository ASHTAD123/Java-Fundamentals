package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameCompator_without_lambda implements Comparator <String>{

    @Override
    public int compare(String o1, String o2) {

        return o1.compareTo(o2);
    }
    
}
class ComparatorClassExample{

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("a","z","c");

        Collections.sort(names, new NameCompator_without_lambda());

        System.out.println(names);
    }
}