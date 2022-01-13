package assignmentFolder;

import java.util.Scanner;

public class InstanceVariableTest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            InstanceVariable myAccount = new InstanceVariable();

            System.out.println("Please enter your name: ");
            String theName = input.nextLine();

            myAccount.setName(theName);
            System.out.println();

            System.out.printf("Name in object Instancevariable is: %n%s%n", myAccount.getName());
        }
    }
