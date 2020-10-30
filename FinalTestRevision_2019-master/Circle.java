public class Circle implements Shape{
    protected double radius;
    //This is parameterized 
    public void Circle(double radius){
        this.radius = radius;
    }
    //This is non-parameterized 
    public void NonCircle(double radius){
        radius = 0.0;
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPeremeter() {
        return Math.PI*this.radius*2; 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return String.format("Area: %f, Peremeter: %f", this.getArea(),this.getPeremeter());
    }

    
}
