package CohortNineTest;

import java.util.Arrays;
import java.util.List;

public class ArraylistIteration {
    public static void main(String[] args) {

        System.out.println();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (Integer number : numbers) System.out.print(number + " ");

        System.out.println();

    }
}
