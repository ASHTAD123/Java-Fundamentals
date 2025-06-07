package OCA_Prep.Constructors;

public class Initialization_order_2 {
    

    static {
        add(2);
    }

    static void add(int num){
        System.out.println(num + " ");
    }

     Initialization_order_2() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new Initialization_order_2();

    }
     {
        add(8);
    }
    public static void main(String[] args) {
        

    }
}
