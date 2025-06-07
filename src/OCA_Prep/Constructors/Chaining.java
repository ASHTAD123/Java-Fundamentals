package OCA_Prep.Constructors;

public class Chaining {
    
    int x;
    int y;

    public Chaining(){
        System.out.println(" I am a default constructor !! ");
    }

    public Chaining(int x){
            this();
            this.x = x;
    }

    public Chaining(int x , int y){
            this(x);
            this.y = y; 
    }

    public static void main(String[] args) {
        
        Chaining c = new Chaining(10,20);
        System.out.println(c.x);
        System.out.println(c.y);
    }
}
