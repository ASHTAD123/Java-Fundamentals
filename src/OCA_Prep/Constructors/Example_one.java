package OCA_Prep.Constructors;

public class Example_one {
    
    String bunnyName;
    int bunnyAge;

    Example_one(){
        System.out.println("I am constructor");
    }
    
    public Example_one(String bunnyName,int bunnyAge){

        System.out.println("Parameterized constructor");
        this.bunnyName = bunnyName;
        this.bunnyAge = bunny;
    }
    public static void main(String[] args) {
        Example_one example_one = new Example_one();
            
    }
}
