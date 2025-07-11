package Concepts.JAVA_8.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_forEach {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        //of() takes stream element as a single element
        Stream <ArrayList<Integer>> stream = Stream.of(a);
       
        stream.forEach(s -> 
                 
                 System.out.println(s)
        );

        List<Integer> modifiedNums= a.stream()
                                    .map(n-> n+1)
                                   .collect(Collectors.toList());

                                      // Print result
        System.out.println("Original: " + a);
        System.out.println("Incremented: " + modifiedNums);
    }
}
