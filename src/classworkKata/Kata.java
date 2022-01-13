package classworkKata;

// package chapterSix;

public class Kata {
    public static String gradeChecker(int score) {

        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score < 80) {
            return "C";
        }
        if (score >= 60) {
            return "D";
        }
        if (score < 70) {
            return "D";
        }
        if (score < 60) {
            return "F";
        }
//        }
        return "";
    }}

//       public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);

//            System.out.println("Enter your score here to view your grade: ");
//            int Score = input.nextInt();

//     if (Score >= 90){
//         System.out.println("You scored: A ");
//     }
//     if (Score == 80){
//         System.out.println("You scored: B ");
//         if (Score <= 90){
//             System.out.println("You scored: B ");
//             if (Score == 70){
//                 System.out.println("You scored: C ");
//                 if (Score <= 80){
//                     System.out.println("You scored: C ");
//                     if (Score == 60){
//                         System.out.println("You scored: D ");
//                         if (Score <= 70){
//                             System.out.println("You scored: D ");
//                             if (Score <= 60){
//                                 System.out.printf("You scored a pure F ");
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }
// }
