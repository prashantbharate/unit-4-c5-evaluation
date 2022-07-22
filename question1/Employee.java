package question1;

public abstract class Employee {

    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public void setemployeeId(int employeeId)
    {
        this.employeeId=employeeId;
    }
    public int getEmployeeId()
    {
        return employeeId;
    }
    public void setemployeeName(String employeeName)
    {
        this.employeeName=employeeName;
    }
    public String setemployeeName()
    {
        return employeeName;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary= salary;
    }
    public Employee(int employeeId,String employeeName)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    abstract void calculateSalary();
}
