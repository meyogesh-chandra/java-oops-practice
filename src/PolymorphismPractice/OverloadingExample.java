package PolymorphismPractice;

class Test{
    public void m1(){
        System.out.println("No arguments");
    }
    public void m1(int i){
        System.out.println("int argument");
    }
    public void m1(double d){
        System.out.println("Double args");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m1(10);
        t.m1(10.5);
        t.m1('a');// if no match it is promoted to next datatypes
        //automatic promotion
    }
}
