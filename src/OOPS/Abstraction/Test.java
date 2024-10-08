
public class Test {
    
    public static void main (String agrs[]){

        Shape s1 = new Circle("Red", 2.2);
        System.out.println("Area of Circle  :" +s1.area());

        Shape s2 = new Rectangle("blue",10,10);
        System.out.println("Area of Rectangle :" +s2.area());
        
       
    }
}