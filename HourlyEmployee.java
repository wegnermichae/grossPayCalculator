public class HourlyEmployee extends Employee{

    private double hourly;
    private double hoursWorked;
    private double grossPay;

    public HourlyEmployee(String name){
        super(name);
    }

    public void setHourlyRate(double hourly){
        this.hourly = hourly;
    }

    public void setHours(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    public double getHourlyRate(){
        return hourly;
    }

    public double getOvertimeOneRate(){
        return hourly*1.5;
    }

    public double getOverTimeTwoRate(){
        return hourly*2;
    }

    public void calculatePay(){
        if(getHoursWorked() <= 80){
            this.grossPay = getHourlyRate() * getHoursWorked();
        }else if(getHoursWorked() >= 80 && getHoursWorked() <= 100){
            this.grossPay = (getHourlyRate() * 80) + (getOvertimeOneRate() * (getHoursWorked()-80));
        }else{
            this.grossPay = (getHourlyRate() * 80) + (getOvertimeOneRate() * 20) + (getOverTimeTwoRate() * (getHoursWorked()-100));
        }
    }

    public double getGrossPay(){
        calculatePay();
        return grossPay;
    }

    public String toString(){
        return "\nEmployee Name: " + getName() + "\nat an hourly rate of: " + getHourlyRate() + "\nWill get a gross pay of: " + getGrossPay();
    }
}
