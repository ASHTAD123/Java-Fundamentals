package OCA_Prep;

public class Initializer {
    


   
    public Initializer(){
        System.out.println("CONSTRUCTOR");
    }
    private String s ="Asas";

     {
        System.out.println("INSTANCE INITIALIZER" + s);
    }


    public static void main(String[] args) {
        Initializer i = new Initializer();
        System.out.println("MAIN");
    }


}
