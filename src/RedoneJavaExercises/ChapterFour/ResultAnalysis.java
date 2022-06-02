package RedoneJavaExercises.ChapterFour;

public class ResultAnalysis {

    private int studentPasses = 0;
    private int studentFailures = 0;
    private int studentsCounter = 1;
    private int result;

    public void setStudentsPasses(int studentPasses) {
        this.studentPasses = studentPasses;
    }

    public int getStudentsResult() {
        return studentPasses;
    }

    public void setStudentsFailures(int studentFailures) {
        this.studentFailures = studentFailures;
    }

    public int getStudentsFailures() {
        return studentFailures;
    }

    public void setStudentsCounter(int studentsCounter) {
        int result = 0;
        while (studentsCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");

            if (result == 1) {
                studentPasses += 1;
            } else
                studentFailures += 1;
            studentsCounter += 1;

//        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (studentPasses >= 8)
            System.out.println("Bonus to instructor!");
    }
        this.studentsCounter = studentsCounter;
    }

    public int getStudentsCounter() {
        return studentsCounter;
    }
}

