public class Accountant extends Employee{
    private double rate;
    //This is parameterized 
    public void Accountant(double rate){
        this.rate = rate;
    }
    //This is Non-parameterized
    public void Accountant(){
        this.rate = 0;
    }
    @Override
    public double getSalary() {
        return this.rate*this.basicPay;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return String.format("Accounttant salary: %.2f", this.getSalary());
    }
}
