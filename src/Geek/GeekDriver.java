/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geek;

import java.util.Scanner;

/**
 *
 * @author lukew
 */
public class GeekDriver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a name:");
        String name = in.nextLine();
        Geek geek = new Geek(name);
        System.out.println("a: Geek's name");
        System.out.println("b: Number of Questions asked");
        System.out.println("c: Smallest of three numbers");
        System.out.println("d: Sum between two integers");
        System.out.println("e: Repeat the string");
        System.out.println("f: It is Palindrome");
        System.out.println("g: string 1 overlaps string 2");
        System.out.println("h: first swap the string");
        System.out.println("?: Display");
        System.out.println("q: Quit");
        String command = "";
        do {
            System.out.print("Please enter a command:");
            command = in.nextLine();
            if (command.equalsIgnoreCase("a")) {
                System.out.println(geek.getName());
            } else if (command.equalsIgnoreCase("b")) {
                System.out.println(geek.getNum_questions());
            } else if (command.equalsIgnoreCase("c")) {
                System.out.print("Please enter a number: ");
                int num1 = in.nextInt();
                System.out.print("Please enter a second number: ");
                int num2 = in.nextInt();
                System.out.print("Please enter a third number: ");
                int num3 = in.nextInt();
                System.out.println(geek.smallest(num1, num2, num3));
            } else if (command.equalsIgnoreCase("d")) {
                System.out.print("Please enter a number: ");
                int num1 = in.nextInt();
                System.out.print("Please enter a second number: ");
                int num2 = in.nextInt();
                System.out.println(geek.sum(num1, num2));
            } else if (command.equalsIgnoreCase("e")) {
                System.out.print("Please enter a statement or word: ");
                String str1 = in.nextLine();
                System.out.print("Please enter a number: ");
                int int1 = in.nextInt();
                System.out.println(geek.repeat(str1, int1));
            } else if (command.equalsIgnoreCase("f")) {
                System.out.println("Please enter a word: ");
                String str1 = in.nextLine();
                if (geek.isPalindrome(str1)) {
                    System.out.println(str1 + " is a Palindrome");
                } else {
                    System.out.println(str1 + " is not a Palindrome");
                }
            } else if (command.equalsIgnoreCase("g")) {
                System.out.println("Please enter a word: ");
                String str1 = in.nextLine();
                System.out.println("Please enter another word: ");
                String str2 = in.nextLine();
                if (geek.overlap(str1, str2)) {
                    System.out.println("The two words overlap!");
                } else {
                    System.out.println("The two words don't overlap!");
                }
            } else if (command.equalsIgnoreCase("h")) {
                System.out.println("Please enter a word: ");
                String str1 = in.nextLine();
                System.out.println("Please enter another word: ");
                String str2 = in.nextLine();
                System.out.println(geek.first_swap(str1, str2));
            } else if (command.equalsIgnoreCase("?")) {
                System.out.println("a: Geek's name");
                System.out.println("b: Number of Questions asked");
                System.out.println("c: Smallest of three numbers");
                System.out.println("d: Sum between two integers");
                System.out.println("e: Repeat the string");
                System.out.println("f: It is Palindrome");
                System.out.println("g: string 1 overlaps string 2");
                System.out.println("h: first swap the string");
                System.out.println("?: Display");
                System.out.println("q: Quit");
            } else if (command.equalsIgnoreCase("q")) {
                break;
            }

        } while (!command.equalsIgnoreCase("q"));

    }

}
