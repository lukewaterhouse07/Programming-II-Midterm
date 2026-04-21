/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roshambo;
import java.util.Random;
/**
 *
 * @author lukew
 */
public class Roshambo {

    public Roshambo() {
    }
    
    public static String randomPick(){
        Random r = new Random();
        String gesture = "";
        int randomNum = r.nextInt(3);
        gesture = switch (randomNum) {
            case 0 -> "r";
            case 1 -> "p";
            default -> "s";
        };
        return gesture;
    }
    
}
