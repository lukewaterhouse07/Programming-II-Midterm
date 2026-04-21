/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roshambo;

import java.util.Scanner;

/**
 *
 * @author lukew
 */
public class RoshamboDriver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String opponent = "";
        System.out.println("Welcome to the game of Roshambo");
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Would you like to play Bert or Lisa? (B/L): ");
        String pick = in.nextLine();
        if (pick.equalsIgnoreCase("b")) {
            opponent = "Bert";
        } else {
            opponent = "Lisa";
        }
        String choice = "";
        do {
            System.out.print("Rock, Paper, Scissors? (R/P/S):");
            String user_pick = in.nextLine();
            String opponent_pick = Roshambo.randomPick();
            if (user_pick.equalsIgnoreCase(opponent_pick)) {
                System.out.println(name + ": " + user_pick);
                System.out.println(opponent + ": " + opponent_pick);
                System.out.println("Draw!");
            } else if (!user_pick.equalsIgnoreCase(opponent_pick)) {
                if (user_pick.equalsIgnoreCase("r") & opponent_pick.equalsIgnoreCase("p")) {
                    System.out.println(name + ": " + user_pick);
                    System.out.println(opponent + ": " + opponent_pick);
                    System.out.println(opponent + " wins!");
                } else if (user_pick.equalsIgnoreCase("p") & opponent_pick.equalsIgnoreCase("r")) {
                    System.out.println(name + ": " + user_pick);
                    System.out.println(opponent + ": " + opponent_pick);
                    System.out.println(name + " wins!");
                } else if (user_pick.equalsIgnoreCase("p") & opponent_pick.equalsIgnoreCase("s")) {
                    System.out.println(name + ": " + user_pick);
                    System.out.println(opponent + ": " + opponent_pick);
                    System.out.println(opponent + " wins!");
                } else if (user_pick.equalsIgnoreCase("s") & opponent_pick.equalsIgnoreCase("p")) {
                    System.out.println(name + ": " + user_pick);
                    System.out.println(opponent + ": " + opponent_pick);
                    System.out.println(name + " wins!");
                } else if (user_pick.equalsIgnoreCase("s") & opponent_pick.equalsIgnoreCase("r")) {
                    System.out.println(name + ": " + user_pick);
                    System.out.println(opponent + ": " + opponent_pick);
                    System.out.println(opponent + " wins!");
                } else if (user_pick.equalsIgnoreCase("r") & opponent_pick.equalsIgnoreCase("s")) {
                    System.out.println(name + ": " + user_pick);
                    System.out.println(opponent + ": " + opponent_pick);
                    System.out.println(name + " wins!");
                }
            }
            System.out.println("Play again? (y/n): ");
            choice = in.nextLine();

        } while (choice.equalsIgnoreCase("y"));
    }
}
