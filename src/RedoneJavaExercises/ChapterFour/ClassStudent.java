package RedoneJavaExercises.ChapterFour;

public class ClassStudent {
    private String firstName;
    private String lastName;
    private double averageScore;

    public ClassStudent(String firstName, String lastName, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (averageScore > 0.0)
            if (averageScore <= 100.0)
                this.averageScore = averageScore;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setAverageScore(double averageScore) {
        if (averageScore > 0.0)
            if (averageScore <= 100.0)
                this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    String letterGrade;

    public double getLetterGrade(double averageScore) {
        if (averageScore > 90.0) letterGrade = "A";
        else if (averageScore > 80.0) letterGrade = "B";
        else if (averageScore > 70.0) letterGrade = "C";
        else if (averageScore > 60.0) letterGrade = "D";
        else letterGrade = "F";
        return averageScore;
    }
}

