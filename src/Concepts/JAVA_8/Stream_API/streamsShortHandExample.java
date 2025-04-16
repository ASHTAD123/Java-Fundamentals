package Concepts.JAVA_8.Stream_API;
import java.util.stream.Stream;

public class streamsShortHandExample {
    
    public static void main(String[] args) {
        
        Stream<Integer> streamOfIntegers = Stream.of(1,2,3,4,7,10);

          streamOfIntegers.forEach(System.out::println);
    }
}
