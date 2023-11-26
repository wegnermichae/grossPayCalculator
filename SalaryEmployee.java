public class SalaryEmployee extends Employee{

    private double salary;
    private double grossPay;

    public SalaryEmployee(String name){
        super(name);
    }

    public void setSalaryRate(double salary){
        this.salary = salary;
    }

    public void calculatePay(){
        this.grossPay = salary/26;
    }

    public double getGrossPay(){
        calculatePay();
        return grossPay;
    }

    public String toString(){
        return "\nEmployee Name: " + getName() + "\nWill get a gross pay of: " + getGrossPay();
    }
}
