public class StringIndexOutOfBoundExceptionExample {
    

    public static void main(String[] args) {
        
        try {
            String a = "Hello, world!";
            System.out.println(a.charAt(50));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException"); 
        }
    }
}
