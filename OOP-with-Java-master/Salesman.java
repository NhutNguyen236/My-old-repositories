public class Salesman extends Employee{
    private int productQuantity;
    
    public Salesman(int productQuantity){
        this.productQuantity = productQuantity;
    }
    
    public Salesman(){
        this.productQuantity = 0;
    }
    
    public Salesman(Salesman p){
        this.productQuantity = p.productQuantity;
    }
    
    @Override
    public double getSalary() {
        return productQuantity*0.5+super.basicPay;
    }
    
    public String toString(){
        return String.format("Name: %s, DOB: %s, Basic Pay: %.2f, Product quantity: %d, Salary: %.2f",super.name,super.DOB,super.basicPay,this.productQuantity,this.getSalary());
    }
}
