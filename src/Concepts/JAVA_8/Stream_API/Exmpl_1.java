package Concepts.JAVA_8.Stream_API;

import java.util.ArrayList;
import java.util.List;

public class Exmpl_1 {
    
    //Before java 8
    public static void main(String[] args) {
    
        List<String> list = new ArrayList<String>();
        list.add("Ashtad");
        list.add("Allan");
        list.add("Nickson");
        list.add("Ryan");

        for (String string : list) {
            
            System.out.println(list.toString());
            
        }
    }

    //PENDING
}
