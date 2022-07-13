import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
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
        while(isCurrentSongOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song " +
                    "off of repeat? If so, answer yes");
            String answer = scanner.next();
            if("yes".equals(answer)){
                isCurrentSongOnRepeat = false;
            }
        }
        System.out.println("Playing next song");

        /* Challenge: Multiple Choice */

        String choiceOne = "One";
        String choiceTwo = "Two";
        String choiceThree = "Three";
        String question = "Which of the following is the correct answer? " + choiceOne +", " + choiceTwo +", or " + choiceThree +"?";
        String correctAnswer = choiceTwo;

        System.out.println(question);
        Scanner scanner1 = new Scanner(System.in);
        String response = scanner1.next();
        if(response.equals(correctAnswer)){
            System.out.println("Congrats!");
        } else {
            System.out.println("Incorrect. Correct answer is " + correctAnswer + ".");
        }
    }
}
