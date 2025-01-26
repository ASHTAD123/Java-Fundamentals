package Concepts.Collection.Practice.Lists;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Interface_Methods_Example {

    public static void main(String[] args) {
        
        List myList = new ArrayList(3);
        
        myList.add("one ");
        myList.add("two");
        myList.add("three");

       
        int size = myList.size();
       
        for(int i=0 ;i<=size; i++){
            myList.add(i);
        }

        System.out.println(myList.toString());
    }
}
