/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Truck implements Function{
    private int distance;
    private int fuel;
    private int productWeight;
    private int removeWeight;
    public Truck(){
        this.distance = 0;
        this.fuel = 0;
        this.productWeight = 0;
        this.removeWeight = 0;
    }
    
    public Truck(int distance, int fuel, int productWeight,int removeWeight){
        this.distance = distance;
        this.fuel = fuel;
        this.productWeight = productWeight;
        this.removeWeight = removeWeight;
    }
    
    public Truck(Truck t){
        this.distance = t.distance;
        this.fuel = t.fuel;
        this.productWeight = t.productWeight;
        this.removeWeight = t.removeWeight;
    }
    
    @Override
    public int putOn() {
       return productWeight;
    }

    @Override
    public int takeOff() {
        return this.putOn() - removeWeight;
    }

    @Override
    public int fuel() {
        return fuel;
    }

    @Override
    public int distance() {
        return distance;
    }

    @Override
    public boolean fuelCheck() {
        return this.fuelRemain()>0;
    }

    @Override
    public int fuelRemain() {
        int remainDistance=this.distance(), remainFuel=this.fuel();
        for(remainDistance=this.distance();remainDistance>100;remainDistance=remainDistance-100){
            remainFuel = remainFuel-20;
        }
        if(remainFuel<=0){
            remainFuel = 0;
        }
        if(remainDistance>0){
                remainFuel = remainFuel - ((remainDistance*2)/100);
        }
        if(this.putOn()>=1000){
            for(int i = this.putOn();i>0;i=i-1000){
                remainFuel = remainFuel - 1;
            }
        }
        return remainFuel;
    }
    
    public String toString(){
        return "Distance: " + this.distance() + " km " + " , " + "Total weight: " +this.putOn()+ " kg " + " , " + " Remain fuel of the truck is: " + this.fuelRemain() + ", and your truck is " + (this.fuelCheck()==true?"still OK":"exhausted");
    }
    
}
