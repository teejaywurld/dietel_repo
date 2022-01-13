package assignmentFolder;

import java.util.Scanner;

public class StringSeparation {
        public static void main(String[] args) {
            System.out.println("Enter a five digit integer");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            String numberAsString = String.valueOf(number);
            String result = "   ";

            for (int i = 0; i < numberAsString.length(); i++) {
                result = result + "   "  + numberAsString.charAt(i);
            }
            System.out.println(result.trim());
        }
    }
