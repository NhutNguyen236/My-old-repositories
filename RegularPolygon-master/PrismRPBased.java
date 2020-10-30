public class PrismRPBased extends RegularPolygon{
    public double height;
    public PrismRPBased(){
        height = 1;
    }
    public PrismRPBased(String name, int sideAmount, double sideLenght, String color, double height){
        super(name,sideAmount,sideLenght,color);
        this.height = height;
    }
    public PrismRPBased(String name, int sideAmount, double height){
        super(name,sideAmount);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(){
        this.height = height;
    }
    public double getVolume(){
        return super.area()*this.height;
    }
    @Override
    public String toString(){
        String polygon = null;
        if(super.getSideAmout()==3)
            polygon = "Triangle";
        if(super.getSideAmout()==4)
            polygon = "Quadrilateral";
        if(super.getSideAmout()==5)
            polygon = "Pentagon";
        if(super.getSideAmout()==6)
            polygon = "Hexagon";
        if(super.getSideAmout()>6)
            polygon = "Polygon more than 6 edges";
        if(super.getSideAmout()<3)
            polygon = "Polygon less than 3 edges";
        return "[Polygon:"+polygon+",Bottom area:"+super.area()+",Volume:"+this.getVolume()+"]"; 
    }
}
