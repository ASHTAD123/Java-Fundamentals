public class Rectangle extends Shape{
   
    double length;
   
    double width;


    Rectangle(String color,double width,double height){
        super(color);
        this.width = width;
        this.length = height;
        System.out.println("Rectangle constructor called");
    }


    @Override
    double area() {
        return length * width;
    }
}
