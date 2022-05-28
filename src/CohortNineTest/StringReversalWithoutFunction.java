package CohortNineTest;

import java.util.Scanner;

public class StringReversalWithoutFunction {
    public static void main(String[] args) {

        String sentence;

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter a word here: ");
        sentence = scanner.nextLine();

        System.out.println();

        System.out.print("After reversing, your entered word is: ");

        for (int i = sentence.length(); i > 0; --i){
            System.out.print(sentence.charAt(i - 1));

        }
        System.out.println();
    }
}
