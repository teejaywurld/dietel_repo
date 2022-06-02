package RedoneJavaExercises.ChapterTwo;

public class QuestionTwoPointSix {
    public static void main(String[] args) {
        char[] cArrays = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '+', '/', ' '};

        for (char c : cArrays){
            printResults(c);
        }
    }

    private static void printResults(char c) {
        System.out.printf("The character %c has the value of %d%n", c, ((int)c));
    }
}
