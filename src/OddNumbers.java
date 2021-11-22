import java.util.Scanner;

public class OddNumbers {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int figure;

            System.out.print("Enter your choice number here: ");
            figure = input.nextInt();

            if (figure % 2 == 0)
                System.out.println("Figure is even");

            if (figure % 2 != 0)
                System.out.println("Figure is odd");
        }
    }
