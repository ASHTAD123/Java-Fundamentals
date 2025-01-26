package Multi_level_Inheritance;

/*
 *  Multi Level Inheritance
 * Each class has extends other class which forms multiple levels
 */
//Base Class
public class GrandParent {
    
    public GrandParent(){
        System.out.println(" Super class GrandParent Constructor");
        System.out.println(this);
    }
}

//Intermediatery class
class Parent extends GrandParent{

    public Parent(){
        System.out.println(" Parent Constructor");
        System.out.println(this);
    }
}

//Derived class
class Child extends Parent{

    
    public static void main(String[] args) {
        System.out.println("Child called");
        Child chld  = new Child();
        
    }
}
