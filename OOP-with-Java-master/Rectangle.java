public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }
    
    public Rectangle(double width, double length){
        this.length =length;
        this.width = width;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.length =length;
        this.width = width;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setLength(double width){
        this.length = length;
    }
    
    public double getArea(){
        return this.length*this.width;
    }
    
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
    
    @Override
    public String toString(){
        return String.format("A Rectangle with width = %.2f and length = %.2f, which a subclass of %s",this.width,this.length,super.toSstring());
    }
}
