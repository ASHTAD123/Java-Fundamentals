package Concepts.JAVA_8.Stream_API;
import java.util.stream.Stream;

public class streamsAreConsumableExample {
    
    public static void main(String[] args) {
        
        Stream<String> stream1 = Stream.of("b","c");

        stream1.forEach(s -> System.out.println(s+"a"));

        //throws illegal exception , as streams are consumable , cannot be resused.
        stream1.forEach(s -> System.out.println(s+"a"));
    }
}
