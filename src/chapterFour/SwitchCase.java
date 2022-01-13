package chapterFour;

import java.util.Scanner;

public class SwitchCase {
        public static void main(String[] args) {
            String prompt = """
                For Igbo press 1
                For English press 2
                For Edo press 3
                For Yoruba press 4
                For Hausa press 5
                """;
            System.out.println(prompt);
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("I speak Igbo");
                    System.out.println("I am a Biafran citizen");
                    System.out.println("Enter anything");
                    int anything = scanner.nextInt();
                    switch (anything){
                        case 14:
                            System.out.println("14");
                            break;
                        case 19:
                            System.out.println("19");
                            break;
                        case 20:
                            System.out.println("20");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("I speak English");
                    break;
                case 3:
                    System.out.println("I speak Edo");
                    break;
                case 4:
                    System.out.println("I speak Yoruba");
                    break;
                case 5:
                    System.out.println("I speak Hausa");
                    break;
                default:
                    System.out.println("Abeg oga, get sense");
            }
        }
    }
