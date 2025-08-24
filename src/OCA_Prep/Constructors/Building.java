package OCA_Prep.Constructors;

public class Building {

    public Building() {
        System.out.println("b ");
    }
    
    Building(String name){
        this();
        System.out.println("bn "+ name);
    }
}
 class House1 extends Building{

    public House1() {
        System.out.println("h ");
    }

  public House1(String name) {
    this();
    System.out.println("hn " +name);
  }

  public static void main(String[] args) {
    new House1("x ");
  }
}

