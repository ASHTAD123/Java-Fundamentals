package OCA_Prep;

public class Initializers_1 {
    
    public Initializers_1(){
        number =5;
    }

    public static void main(String[] args) {
        Initializers_1  i_1 = new Initializers_1();
        System.out.println(i_1.number);
    }

    private  int number =3;

    {
        number=4;
    }
}
