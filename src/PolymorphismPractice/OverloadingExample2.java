package PolymorphismPractice;

class Test2{
    public void m1(Object o){
        System.out.println("Object Version");
    }
    public void m1(String s){
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.m1(new Object());
        t.m1("Yogesh");
        t.m1(null);
    }
}