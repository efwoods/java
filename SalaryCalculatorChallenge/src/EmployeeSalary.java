import java.util.Scanner;

public class EmployeeSalary {
    public static int calculateEmployeeSalary(){
        int hoursWorkedPerWeek;
        int moneyMadePerHour;
        int grossYearlySalary;
        Scanner answer = new Scanner(System.in);


        System.out.println("How many hours does the employee work per week?");
        hoursWorkedPerWeek = answer.nextInt();
        System.out.println("How much does the employee make per hour?");
        moneyMadePerHour = answer.nextInt();
        grossYearlySalary = hoursWorkedPerWeek * moneyMadePerHour * 52;
        return grossYearlySalary;
    }

     public static int main(String[] args){
        int grossYearlySalary = calculateEmployeeSalary();
        System.out.println("The employee's yearly salary is: $" + grossYearlySalary);

    }



}
