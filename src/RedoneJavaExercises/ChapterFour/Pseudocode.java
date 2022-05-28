package RedoneJavaExercises.ChapterFour;

import java.util.Objects;

public class Pseudocode {
    private String grade;


    public void setStudentGrade(float studentGrade) {
        if (studentGrade >= 96 && studentGrade <= 100) grade = "A+";
        else if (studentGrade >= 90 && studentGrade <= 95) grade = "A";
        else if (studentGrade >= 86 && studentGrade <= 89) grade = "B+";
        else if (studentGrade >= 76 && studentGrade <= 79) grade = "B";
        else if (studentGrade >= 70 && studentGrade <= 75) grade = "C";
        else if (studentGrade >= 60 && studentGrade <= 69) grade = "D";
        else if (studentGrade >= 40 && studentGrade <= 59) grade = "E";
        else grade = "F";
    }

    public String getStudentGrade() {
        return grade;
    }




}
