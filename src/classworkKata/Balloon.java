package classworkKata;

// TODO Write a program that returns the words balloon
// TODO with its characters reversed.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Pig Latin Word
//Chapter 14 Question 14.7

 public class Balloon {
     public static void main(String[] args) {
////        String letters = "MiSsisSippi";
////
////        List<Integer> listOfIndices = new ArrayList<>();
////
////        for (int i=0; i < letters.length(); i++){
////            if (String.valueOf(letters.charAt(i)).equalsIgnoreCase("s")){
////                listOfIndices.add(i);
////            }
////        }
////        System.out.println(listOfIndices);
//
//        String words = "    chair    man    ";
////        System.out.println("chair" + "man");
//        System.out.println(words.replaceAll(" ", ""));

         System.out.println("Enter a sentence and i will convert it to pig latin");
         Scanner scanner = new Scanner(System.in);

         String[] sentence = scanner.nextLine().split(" ");
         StringBuilder pigLatinSentence = new StringBuilder();

         for (String word : sentence){
             pigLatinSentence.append(printLatinWord(word)).append(" ");
         }

         System.out.println(pigLatinSentence);
     }

     public static String printLatinWord(String word){
         StringBuilder result = new StringBuilder(word);
         Character character = result.charAt(0);
         result.insert(result.length(), character);
         result.append("ay");
         return result.substring(1);
     }
 }


