package OCA_Prep.Lambda_Expressions;

import java.util.function.Predicate;

public class PredicateExample {
    
    public static void main(String[] args) {
        
        Predicate<Integer> p = i-> i>10;
        System.out.println(p.test(100));//true
        System.out.println(p.test(5));
    }
}
