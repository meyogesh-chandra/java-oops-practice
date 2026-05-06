package InheritanceConcept;

class P{
    public void m1(){
        System.out.println("Parent");
    }

}

class C extends P{
    public void m2(){
        System.out.println("Child");
    }
}

class Test{
    public static void main(String[] args) {
        P p= new P();
        p.m1();

        C c= new C();
        c.m1();
        c.m2();

        // Parent reference can hold child object
        P p1 = new P();
        p1.m1();
        //p1.m2(); invalid

        // child reference can not be use to hold parent object
        //C c1 = new P();
    }
}
