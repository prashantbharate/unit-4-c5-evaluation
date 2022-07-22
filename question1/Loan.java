package question1;

public class Loan {

    public Loan()
    {

    }

    public double calculateLoanAmount(Employee e1)
    {
       if(e1 instanceof PermanentEmployee)
       {
           double salary=e1.getSalary();
           salary=salary*12;
           double amount =(salary*15)/100;
           return amount;
       }
       else if(e1 instanceof TemporaryEmployee)
       {
           double salary=e1.getSalary();
           double amount =(salary*10)/100;
           return amount;
       }
       return 0;
    }


}
