public abstract class Shape {
   
    String color;
    
    public Shape(String color){
        System.out.println("Shape Constructor");
        this.color = color;
    }
    abstract double area();

}