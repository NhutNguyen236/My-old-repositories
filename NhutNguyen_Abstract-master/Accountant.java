public class Accountant extends Employee{
    private double rate;
    
    public Accountant(double rate){
        this.rate = rate;
    }
    
    public Accountant(){
        this.rate = 0;
    }
    
    public Accountant(Accountant r){
        this.rate = r.rate;
    }
    
    @Override
    public double getSalary() {
        return rate*super.basicPay+super.basicPay;
    }
    
    @Override 
    public String toString(){
        return String.format("Name: %s, DOB: %s, Basic Pay: %.2f, Rate: %.2f, Salary: %.2f", super.name, super.DOB, super.basicPay, this.rate, this.getSalary());
    }
}
