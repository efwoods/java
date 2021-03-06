import java.util.Scanner;

public class HelloWorld {
    public static void announceTeaTime() {
        System.out.println("Waiting for Tea Time...");
        System.out.println("Type in random word and press Enter" +
                " to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time!");
    }

    public static void practice() {
        int studentAge = 15;
        double studentGPA = 3.45;
        String myFavoriteWord = "speaker";
        String studentName = "Kayla Harley";
        String studentFirstName = "Kayla";
        String studentLastName = "Harley";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(myFavoriteWord);
        System.out.println(studentName);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName +
                " has a GPA of " + studentGPA + ".");
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName +
                " now has a GPA of " + studentGPA + ".");

        System.out.println("Hello World! It's me, Evan!");

        System.out.println("Pick a number between 1 and 10");
        input = new Scanner(System.in);
        int inputNum = input.nextInt();

        if (inputNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you happy today");
        }
        boolean isCurrentSongOnRepeat = true;
        Scanner scanner = new Scanner(System.in);
        while (isCurrentSongOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song " +
                    "off of repeat? If so, answer yes");
            String answer = scanner.next();
            if ("yes".equals(answer)) {
                isCurrentSongOnRepeat = false;
            }
        }
        System.out.println("Playing next song");

        /* Challenge: Multiple Choice */

        String choiceOne = "One";
        String choiceTwo = "Two";
        String choiceThree = "Three";
        String question = "Which of the following is the correct answer? " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + "?";
        String correctAnswer = choiceTwo;

        System.out.println(question);
        Scanner scanner1 = new Scanner(System.in);
        String response = scanner1.next();
        if (response.equals(correctAnswer)) {
            System.out.println("Congrats!");
        } else {
            System.out.println("Incorrect. Correct answer is " + correctAnswer + ".");
        }
    }

    public static void teaTimePractice(){System.out.println("Welcome to your new job");
        announceTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");
        System.out.println("Learn stuff");

        announceTeaTime();

        System.out.println("Get promoted!");
    }

    public static double calculateTotalMealPrice(double listedPrice,
                                               double tipRate,
                                               double taxRate){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
        return result;

    }
    public static void main(String[] args) {
        double groupTotalMealCost = calculateTotalMealPrice(100,.2,.08);
        System.out.println(groupTotalMealCost);
        double individualTotalMealCost = groupTotalMealCost / 5;
        System.out.println(individualTotalMealCost);
        double result =Math.pow(2, 5);
        System.out.println(result);
    }
}
