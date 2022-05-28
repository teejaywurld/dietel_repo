package CohortNineTest;

public class StringReversal {
    public static void main(String[] args) {
        String words = "cohort_nine";

        char[] statement = words.toCharArray();

        for (int i = statement.length - 1; i >= 0; i--)
            System.out.print(statement[i]);
    }
}
