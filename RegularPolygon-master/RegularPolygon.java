public class RegularPolygon {
    private String name;
    private int sideAmount;
    private double sideLenght;
    private String color;
    private static int quantity;
    
    public RegularPolygon(){
        name = "";
        sideAmount = 3;
        sideLenght = 1.0;
        color = "red";
    }
    
    public RegularPolygon(String name, int sideAmount, double sideLenght, String color){
        this.color = color;
        this.name = name;
        this.sideAmount = sideAmount;
        this.sideLenght = sideLenght;
    }
    
    public RegularPolygon(String name, int sideAmount){
        this.name = name;
        this.sideAmount = sideAmount;
        color = "red";
        sideLenght = 1;
    }
    
    public RegularPolygon(RegularPolygon rp){
        this.color = rp.color;
        this.name = rp.name;
        this.sideAmount = rp.sideAmount;
        this.sideLenght = rp.sideLenght;
    }
    
    public void setName(String name){
       this.name = name;
       quantity++;
    }
    public void setSideAmount(int sideAmount){
        this.sideAmount = sideAmount;
    }
    public void setSideLength(double sideLenght){
        this.sideLenght = sideLenght;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public static int getQuantity(){
        return quantity;
    }
    
    public String getName(){
        return this.name;
    }
    public int getSideAmout(){
        return this.sideAmount;
    }
    public double getSideLenght(){
        return this.sideLenght;
    }
    public String getColor(){
        return this.color;
    }
    
    public String getPolygon(){
        String result;
        switch(this.getSideAmout()){
            case 3:
                result =  "Triangle";
                break;
            case 4:
                result =  "Quadrilateral";
                break;
            case 5:
                result =  "Pentagon";
                break;
            case 6:
                result =  "Hexagon";
                break;
            default:
                result = "Polygon more than 6 edges";
        }
        return result;
    }
    
    public double perimeter(){
        return this.getSideAmout()*this.getSideLenght();
    }
    
    public double area(){
        double a = 0;
        if(this.getSideAmout()>6 || this.getSideAmout()<3){
            return -1;
        }
        else{
            switch(this.getSideAmout()){
                case 3:
                    a = 0.433;
                    break;
                case 4:
                    a = 1;
                    break;
                case 5:
                    a = 1.72;
                    break;
                case 6:
                    a = 2.598;
                    break;
            }
            return Math.pow(this.getSideLenght(), 2)*a;
        }             
    }              
    
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        RegularPolygon polygon  = (RegularPolygon)obj;
        if(this.color==polygon.color && this.sideAmount==polygon.sideAmount && this.sideLenght==polygon.sideLenght){
            if(this.color!=null && polygon.color!=null)
                return true;
        }
        return false;
    }
    
}
