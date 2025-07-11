package Concepts.JAVA_8.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Examples {

    public static void main(String[] args) {
        
        
    ArrayList namesList = new ArrayList();
    namesList.add("Ashtad");    
    namesList.add("Rahul");    
    namesList.add("Sherwyn");  
    namesList.add("AS");  

    Stream<String> streamofNames = namesList.stream();

    List list = streamofNames.filter(e -> e.length()>2)
                             .collect(Collectors.toList());
                            
    System.out.println(list);





    
}
}
