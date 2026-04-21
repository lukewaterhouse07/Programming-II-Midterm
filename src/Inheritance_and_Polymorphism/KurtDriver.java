/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_and_Polymorphism;

/**
 *
 * @author lukew
 */
public class KurtDriver {

    public static void main(String[] args) {
        Kurt var1 = new Jerry();
        Chris var2 = new Chris();
        Kurt var3 = new Eddie();
        Kurt var4 = new Chris();
        Object var5 = new Jerry();
        //var1.a(); Kurt 1/ Jerry 3/ Kurt 3
        //var1.c(); Jerry 3/ Kurt 3
        //var2.a(); Kurt 1/ Chris 3
        //var2.b(); Chris 2/ Jerry 3/ Kurt 3
        //var3.a(); Kurt 1/ Eddie 3
        //var3.b(); Error
        //var4.a(); Kurt 1/ Chris 3
        //var5.a(); Error 
        //((Chris) var5).a(); Error
        //((Jerry) var1).a(); Kurt 1/ Jerry 3/ Kurt 3
        //((Jerry) var4).a(); Kurt 1/ Chris 3
        //((Chris) var3).b(); Error
        //((Eddie) var3).b(); Kurt 1/ Eddie 3/ Eddie 2
        //((Jerry) var4).c(); Chris 3
        //((Kurt) var5).c(); Jerry 3/ Kurt 3
    }
}
