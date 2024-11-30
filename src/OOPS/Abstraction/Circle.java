class Circle extends Shape{

    double radius;

    public Circle(String color,double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

}