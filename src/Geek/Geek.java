/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geek;

/**
 *
 * @author lukew
 */
public class Geek {

    private String name;
    private int num_questions;

    public Geek(String name) {
        this.name = name;
        this.num_questions = 0;
    }

    public int smallest(int num1, int num2, int num3) {
        int smallest;
        num_questions++;
        if (num1 < num2 & num1 < num3) {
            smallest = num1;
        } else if (num2 < num1 & num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        return smallest;
    }

    public int sum(int num1, int num2) {
        int sum = 0;
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                sum += i;
            }
        } else if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public String repeat(String str, int n) {
        num_questions++;
        String repeated_String = "";
        for (int i = 1; i <= n; i++) {
            repeated_String += str;
        }
        return repeated_String;
    }

    public boolean isPalindrome(String str) {
        num_questions++;
        boolean isPalindrome = false;
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public boolean overlap(String str1, String str2) {
        num_questions++;
        boolean overlap = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    overlap = true;
                } else {
                    overlap = false;
                }
            }
        }
        return overlap;
    }

    public String first_swap(String s1, String s2) {
        num_questions++;
        char char1 = s1.charAt(0);
        char char2 = s2.charAt(0);
        s1 = s1.replace(char1, char2);
        s2 = s2.replace(char2, char1);
        return s1 + s2;
    }

    public String getName() {
        return name;
    }

    public int getNum_questions() {
        return num_questions;
    }

}
