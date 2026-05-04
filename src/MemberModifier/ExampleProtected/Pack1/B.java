package MemberModifier.ExampleProtected.Pack1;
// protected accessible within same package like default
// but it is also accessible only from child class of different package
public class B extends A{
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        B b = new B();
        b.m1();

        A a1 =  new A();
        a1.m1();
// you can not assign parent reference to child
      //B b1 = new A();
      // b1.m1();
    }
}
