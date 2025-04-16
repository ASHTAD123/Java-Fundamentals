package Concepts.JAVA_8.Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class stream {
    
    public static void main(String[] args) {
        
        List<Integer> listEven = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(19);
     
        List<Integer> filteredList = list.stream()
                                .filter(i-> i%2==0)
                                .collect(Collectors.toList());


        System.out.println(filteredList);
        
    }
}
