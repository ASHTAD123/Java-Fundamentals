package OCA_Prep.Constructors;

public class Initialization_order_1 {
    
    private String name="Ranchi";

    {
        System.out.println(name);
    }

    private static int COUNT =0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT = COUNT + 10;
        System.out.println(COUNT);
    }

    public Initialization_order_1(){
        System.out.println("I am a constructor");
    }


    public static void main(String[] args) {
        Initialization_order_1 i_1 = new Initialization_order_1();
    }
}
