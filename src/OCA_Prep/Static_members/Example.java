package OCA_Prep.Static_members;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Static import
import static java.util.Arrays.asList;

public class Example {

    static int counter =20;
    int y;
    static final int count=1;
    static final int count2;



    //loaded before contructors or instance initializers
    static{
        int z =20;
        x = 30;
        // count = 90; 
        count2=0; //assigning possible because it's 1st assignment
        // count2=9; but re-assignment is not possible
    }


    public static int getCounter(){
        // System.out.println(y);//cannot access non-static field in static context,compile time error
        //count=2; cannot assign value to a final variable
        return counter;
    }

    //vice versa is possible
    //static methods can be accessed in non-static context
    public void fun(){
        System.out.println(counter);
    }

    static List<Integer> asList(int a,int b){
      
        List<Integer> l = new ArrayList<>(10);
        l.add(a,b);

        System.out.println("My own asList method is used instead of Arrays.asList()");
        return l;
   
    }


    public static void main(String[] args) {
        
        //due to static import
      List<Integer> a  = asList(1,2);

      System.out.println(a);
      //if we have same method asList() in our class compiler will give
      //preference to our method
      //but we need to differentiate if we want to use both methods

    }



}
