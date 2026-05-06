package PolymorphismPractice;

class p3{
    public void m1(){

    }
}
class c3 extends p3{
    public final void m1(){

    }
}
// if parent method has final so overriding not possible
// in this case child is final but its next level child can not override
