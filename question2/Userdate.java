package question2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
public class Userdate {



        public void checkEligible(String dob) {

                LocalDate cdate =LocalDate.now();

                DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy");

                LocalDate udate=LocalDate.parse(dob,dtf);

                Period diff =Period.between(udate, cdate);

                int age =diff.getYears();
                int bm=diff.getMonths();
                int bday =diff.getDays();


                if(bday==0 && bm==0 && age>=18) {
                    System.out.println("Happy Birthday, You are eligible to cast your vote.");
                }else if(age>=18) {
                    System.out.println("You are eligible to cast your vote");
                }else{
                    System.out.println("You are Not eligible for Vote");
                }


        }

        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);

            System.out.println("Enter Your Date of Birth:");
            String dob= sc.next();
            Userdate us=new Userdate();
            us.checkEligible(dob);


               // System.out.println();


    }
}
