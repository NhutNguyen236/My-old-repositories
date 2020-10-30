public class Salesman extends Employee{
    private int productQuantity;
    //This is Parameterized
    public void Salesman(int productQuantity){
        this.productQuantity = productQuantity;
    }
    //This is Non--Parameterized
    public void NonSalesman(int productQuantity){
        productQuantity = 0; 
    }
    @Override
    public double getSalary() {
        return this.productQuantity*0.05+this.basicPay;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return String.format("Salesman Salary: %.2f",this.getSalary());
    }
}
