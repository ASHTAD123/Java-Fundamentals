import java.util.ArrayList;
import java.util.List;

class throws_keyword_Ex_1{

    private static List<Integer> integers = new ArrayList<Integer>();

    static void addInteger(Integer value) throws IllegalArgumentException{

       if(integers.contains(value)){
           throw new IllegalArgumentException("Integer already added");
       } 

       integers.add(value);
     }

    public static void main(String[] args) {
      
        try {
          addInteger(1);
          addInteger(1);
        } catch (IllegalArgumentException ie) {
            ie.printStackTrace();
        }

    }
}