package OCA_Prep.Arrays;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicBorders;

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

        int result = heights.get(0);
        Integer result_1 = heights.get(0);

        System.out.println(heights);

        for(int a=0; a<heights.size(); a++){

            System.out.println(heights.get(a) + " ");
        }

        ArrayList friends = new ArrayList<>();
        friends.add("FRIEND 1");
        friends.add("FRIEND 2");
        friends.add("FRIEND 3");

        //Converting arrayList to array
        String birdsArray[] = friends.toArray(new String[0]);









    }
}
