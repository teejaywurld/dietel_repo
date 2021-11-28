package chapterFour;

import java.util.Scanner;

public class Semicolon {
    public static void main(String[] args) {
       // Native aNative = new Native("Mary Jane", 1);
       // System.out.println(aNative.getName());
       // System.out.println(aNative.getScvId());


        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Name: ");
        String name = scan.next();
        System.out.println(" Enter scv number: ");
        int scvNumber = scan.nextInt();
        Native aNative = new Native(name, scvNumber);
        System.out.println(aNative.getName());
        System.out.println(aNative.getScvId());
    }
}
