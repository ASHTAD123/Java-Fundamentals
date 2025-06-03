package OCA_Prep.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class WrapperClasses {
    
    public static void main(String[] args) {
        
        Integer i = new Integer(10);

        int x = i;

        String number ="123";
        int primitive = Integer.parseInt(number);
        System.out.println(primitive);

        Integer wrapper = Integer.valueOf(number);

        int i2 = Integer.valueOf("24").intValue();

        ArrayList<Integer> heights = new ArrayList<Integer>();
        heights.add(null);

        System.out.println(heights.get(0));

     //   int result = heights.get(0);
        Integer result_1 = heights.get(0);

        System.out.println(heights);

        for(int a=0; a<heights.size(); a++){

            System.out.println(heights.get(a) + " ");
        }

        ArrayList<String> friends = new ArrayList<String>();
        friends.add("FRIEND 1");
        friends.add("FRIEND 2");
        friends.add("FRIEND 3");

        //Converting arrayList to array
        String birdsArray[] = friends.toArray(new String[0]);


        //Converting arrays to arraylist(also called as backed list)
        //we cannot add more elements in arraylist which is created by arrays
        //list becomes of fixed size as arrays have a fixed size
        String[] birds ={"Hawk","Robin","Parrot"};

        List<String> birdsBackedList = Arrays.asList(birds);
       
        birdsBackedList.set(0, "newBird");
        System.out.println();

        System.out.println(birdsBackedList);
        System.out.println(Arrays.toString(birds));//change also refelected in birds array


        //Sorting
        List<Integer> asList = Arrays.asList(50,2,100,10);

        Collections.sort(asList);

        System.out.println(asList);

    }
}
