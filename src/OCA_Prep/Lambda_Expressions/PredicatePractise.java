import java.util.List;
import java.util.ArrayList;

class PredicatePractise{
    
    public static void main(String[] args) {
    
        List<String> bunnies = new ArrayList<String>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");

        System.out.println(bunnies);

        //for each item it will be checked
        bunnies.removeIf( s-> s.charAt(0) != 'h');

        System.out.println(bunnies);

    }
}