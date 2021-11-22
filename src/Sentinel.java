import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        // collect score
        // check for sentinel4
        // add score
        int total = 0;
        int score = 0;

            do {
                total += score;
                System.out.println("Enter a score: ");
                Scanner scanner = new Scanner(System.in);
                score = scanner.nextInt();
              }
            while (score >= 0 && score < 101);
        System.out.println("Total is "+ total);
            }

            }
