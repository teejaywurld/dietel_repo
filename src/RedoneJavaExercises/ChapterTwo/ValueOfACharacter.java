package RedoneJavaExercises.ChapterTwo;

import java.util.Scanner;

public class ValueOfACharacter {
    public static void totalResult(){
        int entryResult = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kindly enter the number of variables you want here: ");
        int[] unicode = new int[scanner.nextInt()];
        for (int i = 0; i < unicode.length; i++){
            System.out.print("Input your integer characters here: ");
            unicode[i] = scanner.nextInt();
        }
        for (int i : unicode){
            entryResult += i;
        }
        System.out.println(entryResult);
    }

    public static void main(String[] args) { totalResult(); }
}
