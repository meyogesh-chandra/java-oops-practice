package PolymorphismPractice;

class P{
    public void property(){
        System.out.println("Gold,Land,Cash");
    }
    public void marry(){
        System.out.println("some A");
    }
}
class C extends P{
    public void marry(){
        System.out.println("some B");
    }
}
class T{
    public static void main(String[] args) {
        P p = new P();
        p.marry();
        p.property();

        C c = new C();
        c.marry();

        P p1 = new C();
        p1.marry();
    }
}
