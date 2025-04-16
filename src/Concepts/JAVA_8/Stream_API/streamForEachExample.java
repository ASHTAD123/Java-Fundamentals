package Concepts.JAVA_8.Stream_API;
import java.util.stream.Stream;

public class streamForEachExample{
    
    public static void main(String[] args) {
        
            Stream<String> stream = Stream.of("A","b","c","122");
            
            stream.forEach(s-> System.out.println(s));
    }
}
