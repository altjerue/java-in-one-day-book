package org.jmrb.switchdemo;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String userGuide = input.nextLine().toUpperCase();

        switch (userGuide) {
            case "A+":
            case "A":
                System.out.println("Distinction");
                System.out.println("Well Done!");
                break;
            case "B":
                System.out.println("B Grade");
                break;
            case "C":
                System.out.println("C Grade");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
