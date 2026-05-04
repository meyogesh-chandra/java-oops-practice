package Basics.Pack1;

import Basics.Pack2.B;

public class A {
    public void show(){
        System.out.println("A show class");
    }
    public static void main(String[] args) {
        System.out.println("A class");
        B obj1 = new B();
        obj1.show();
    }
    // both class are public so accessible from different package
}
