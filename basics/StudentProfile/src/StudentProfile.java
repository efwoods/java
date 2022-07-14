public class StudentProfile{
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;
    boolean bestBehavior;

    public StudentProfile(String firstName, String lastName,
                          int expectedYearToGraduate, double GPA,
                          String declaredMajor, boolean bestBehavior) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
        this.bestBehavior = bestBehavior;
    }

    public static void incrementExpectedGraduationYear(StudentProfile profile){
        if(profile.bestBehavior == false){
            System.out.println("Expected Year to Graduate is: " + (profile.expectedYearToGraduate+1));
        } else {
            System.out.println("Expected Year to Graduate is: " + profile.expectedYearToGraduate);
        }

    }
}
