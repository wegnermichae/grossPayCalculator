import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String name = in.nextLine();

        System.out.println("Enter employee type: S for Salary or H for Hourly: ");
        String type = in.nextLine();

        if(type.compareToIgnoreCase("H") == 0){
            HourlyEmployee employee = new HourlyEmployee(name);
            System.out.println("Enter Hourly Rate: ");
            employee.setHourlyRate(in.nextDouble());
            System.out.println("Enter hours worked: ");
            employee.setHours(in.nextDouble());
            System.out.println(employee);
        }else if(type.compareToIgnoreCase("S") == 0){
            SalaryEmployee employee = new SalaryEmployee(name);
            System.out.println("Enter employee salary: ");
            employee.setSalaryRate(in.nextDouble());
            System.out.println(employee);
        }
    }
}