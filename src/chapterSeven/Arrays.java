package chapterSeven;
//import java.util.Scanner;
//
//public class Arrays {
//    public static void main(String[] args) {
//        int [] c = new int[12];
//        int [] c = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300};
//
//        System.out.printf("%s%8s%n", "Index", "Value");
//
//        for (int counter = 0; counter < c.length; counter++)
//            System.out.printf("%5d%8d%n", counter, c[counter]);
//
//    }
//}
//
//        final int ARRAY_LENGTH = 12;
//        int [] array = new int[ARRAY_LENGTH];
//
//        for (int counter = 0; counter < array.length; counter++)
//         //   array[counter] = 2 + 2 * counter;
//
//        System.out.printf("%s%8s%n", "Index", "Value");
//
//        for (int counter = 0; counter < array.length; counter++)
//            System.out.printf("%5d%8d%n", counter, array[counter]);
//
//    }                 double table = new double [5][5];
//}

//            Scanner scanner = new Scanner(System.in);
//            double [] prices = new double[6];
//        System.out.println("Enter your 6 values here: ");
//
//        prices [0] = scanner.nextDouble();
//        prices [1] = scanner.nextDouble();
//        prices [2] = scanner.nextDouble();
//        prices [3] = scanner.nextDouble();
//        prices [4] = scanner.nextDouble();
//        prices [5] = scanner.nextDouble();
//        double total = prices [0] + prices [1] + prices [2] + prices [3] + prices [4] + prices [5];
//        System.out.printf("The total of your 6 values are $%6.2f%n ", total);
//    }
//}

public class Arrays {
    public static void main(String[] args){
        final int ARRAY_LENGTH = 10;
        int [] array = new int[ARRAY_LENGTH];
//        int[] array = {10, 34, 55, 68, 74, 33, 38,82, 91, 28, 41};

        for (int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%10s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%3d%10d%n", counter, array[counter]);
        }

    }
}
