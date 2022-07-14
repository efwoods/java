import java.util.Scanner;

public class EmployeeSalary {
    public static int calculateEmployeeSalary(int hoursWorkedPerWeek,
                                              int moneyMadePerHour,
                                              int vacationDays){
        int grossYearlySalary;

        grossYearlySalary = (hoursWorkedPerWeek * moneyMadePerHour * 52) - (vacationDays * moneyMadePerHour * 8);
        return grossYearlySalary;
    }

     public static void main(String[] args){
         int hoursWorkedPerWeek;
         int moneyMadePerHour;
         int grossYearlySalary;
         int vacationDays;
         Scanner answer = new Scanner(System.in);

         System.out.println("How many hours does the employee work per week?");
         hoursWorkedPerWeek = answer.nextInt();
         System.out.println("How much does the employee make per hour?");
         moneyMadePerHour = answer.nextInt();
         System.out.println("How many days of vacation has the employee taken?");
         vacationDays = answer.nextInt();

        grossYearlySalary = calculateEmployeeSalary(hoursWorkedPerWeek, moneyMadePerHour, vacationDays);
        System.out.println("The employee's yearly salary is: $" + grossYearlySalary);
    }



}
