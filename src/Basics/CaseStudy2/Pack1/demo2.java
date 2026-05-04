package Basics.CaseStudy2.Pack1;

class B{
    void show(){
        System.out.println("class B show demo 2");
    }
    public static void main(String[] args) {
        System.out.println("B class in demo2 pack1");
        A obj1 = new A();
        obj1.show();
    }
}
// default class same package accessible
