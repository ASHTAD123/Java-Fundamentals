package OCA_Prep.Static_members;

import Static_members.Example;
import org.w3c.dom.css.Counter;

public class Example_1 {
   
    public static void main(String[] args) {
        
        System.out.println("Accessing static variable from example class");
        System.out.println(Example.counter);

        Example.counter++;

        //can access static variables ,methods also with object
        Example e = new Example();
        e = null;
        // System.out.println(e.y);//Null Pointer Exception
        System.out.println(e.counter);//no null pointer because it's not associated to an object

        System.out.println(Example.getCounter());


    }
}
