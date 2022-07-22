package question1;

public class TemporaryEmployee extends Employee{
    int hoursWorked;
    int hourlyWages;
    public TemporaryEmployee(int employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    @Override
    void calculateSalary() {
        double salary=hoursWorked * hourlyWages;
        this.setSalary(salary);
    }
    public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked ,int hourlyWages)
    {
        super(employeeId,employeeName);
        this.hourlyWages=hourlyWages;
        this.hoursWorked=hoursWorked;

    }

}
