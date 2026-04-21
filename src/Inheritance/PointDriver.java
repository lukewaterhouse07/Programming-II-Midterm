/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author lukew
 */
public class PointDriver {
    public static void main(String[] args) {
        Point one = new Point(3, 4);
        Point3D two = new Point3D(8, 4, 8);
        System.out.println(one.distanceFromOrigin());
        System.out.println(one.toString());
        one.setLocation(5, 6);
        System.out.println(one.toString());
        System.out.println(two.distanceFromOrigin());
        System.out.println(two.getZ());
        System.out.println(two.toString());
    }
}
