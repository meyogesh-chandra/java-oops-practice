package Basics.Pack2;

import Basics.Pack1.A;

public class B {
    public void show(){
        System.out.println("B class show");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
