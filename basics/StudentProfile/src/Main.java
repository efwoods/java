

public class Main {
    public static void main(String[] args){
        StudentProfile modelStudentProfile = new StudentProfile(
                "Model","Student",
                2020,
                4.0,
                "Engineering",
                true);

        StudentProfile awfulStudentProfile = new StudentProfile(
                "Awful","Student",
                2020,
                4.0,
                "Engineering",
                false);

        //StudentProfile.incrementExpectedGraduationYear(modelStudentProfile);
        StudentProfile.incrementExpectedGraduationYear(awfulStudentProfile);
    }
}
