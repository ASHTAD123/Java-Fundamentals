package Single_Inheritance;

/*
 *  Single Level Inheritance
 *  Each class has a single parent class
 */

public class Parent {
    
    public void behaviour(){
        System.out.println("Parent Behaviour");
    }
    public void eatingHabbits(){
        System.out.println("Parent eating habbits");
    }
}
class Child extends Parent{
    
    public void behaviour(){
        System.out.println("Child inherited parent behaviour");
    }
    public void eatingHabbits(){
        System.out.println("Parent eating habbits gained by child");
        super.behaviour();
    }
    
    
    public static void main(String[] args) {
        Child childObject = new Child();
        childObject.behaviour();
    }
    
}
