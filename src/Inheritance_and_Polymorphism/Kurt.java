/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_and_Polymorphism;



class Eddie extends Kurt{
    public void b() {
        a();
        System.out.println("Eddie 2");
    }
    public void c() {
        System.out.println("Eddie 3");
    }
    
}
class Kurt {
    public void a() {
        System.out.println("Kurt 1");
        c();
    }
    public void c() {
        System.out.println("Kurt 3");
    }
    
}

class Chris extends Jerry {
    public void b() {
        System.out.println("Chris 2");
        super.c();
    }
    
    public void c() {
        System.out.println("Chris 3");
    }
}
class Jerry extends Kurt {
    @Override
    public void c() {
        System.out.println("Jerry 3");
        super.c();
    }
}