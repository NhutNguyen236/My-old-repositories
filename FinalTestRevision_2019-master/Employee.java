public abstract class Employee {
    protected String name;
    protected String DOB;
    protected double basicPay;
    //This is Parameterized
    public void Employee(String name, String DOB, double basicPay){
        this.DOB = DOB;
        this.basicPay = basicPay;
        this.name= name;
    }
    //This is Non--Parameterized
    public void NonEmployee(String name, String DOB, double basicPay){
        DOB = null;
        name = null;
        basicPay = 0;
    }
    public abstract double getSalary();
}
