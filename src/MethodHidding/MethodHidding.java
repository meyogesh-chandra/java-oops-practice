package MethodHidding;

class P{
    public static void m1(){
        System.out.println("Parent");
    }
}
class C extends P{

        public static void m1(){
            System.out.println("Child");
        }

}
// Both method are static so method resolution done based on reference type by compiler
// if not static then method resolution done by jvm based on runtime object
class Test{
    public static void main(String[] args) {
        P p = new P();
        p.m1();

        C c = new C();
        c.m1();

        P p1 = new C();
        p1.m1();
    }
}