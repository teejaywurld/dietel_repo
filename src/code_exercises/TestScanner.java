package code_exercises;

import java.util.Scanner;

public class TestScanner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first name: ");
            String firstName =  scanner.nextLine();

            System.out.println("Enter last name: ");
            String lastName = String.valueOf(scanner.nextInt());

            System.out.println("First name : " + firstName);
            System.out.println("Last name : " + lastName);
        }
    }
