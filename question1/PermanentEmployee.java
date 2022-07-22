package question1;

public class PermanentEmployee extends Employee{
    double basicPay;
    public PermanentEmployee(int employeeId, String employeeName, int i) {
        super(employeeId, employeeName);
    }

    @Override
    void calculateSalary() {
        double salary=basicPay-(basicPay * 0.12);
        this.setSalary(salary);
    }

}
