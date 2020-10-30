public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        super();
        this.radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
    
    @Override
    public String toString(){
        return String.format("A Circle with radius = %.2f, which a subclass of %s",this.radius,super.toSstring());
    }
}
