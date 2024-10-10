public class NullPointerExceptionExample {
 
    @SuppressWarnings("null")
    public static void main(String[] args) {
        
        try{
            String a = null;
            System.err.println(a.charAt(0));
        }catch(Exception e){
            System.out.println("NullPointerException occurred ");
            e.printStackTrace();
        }
    }
}
