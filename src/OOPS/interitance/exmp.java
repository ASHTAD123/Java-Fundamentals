package OCA_Prep.OOPS.Interitance;

public class exmp {
    
    int a=100;
    static int b = 200;

    public void a(){
    System.out.println("Method to be overidden");
    }

    public static void b(){
        System.out.println("Static method b");
    }
    public static void main(String[] args) {
        
    }
}

class exmp1 extends exmp{

    // Inheriting method from super class
    public void a() {
        System.out.println("Overriding method");
    }

    public static void main(String[] args) {
        exmp1 exmp1 = new exmp1();
        b();
        // Interiting instance variable
        System.out.println(exmp1.a);

        // Inheriting static variable
        System.out.println(b);

        // Inheriting static method
        exmp1.b();
    }
}

