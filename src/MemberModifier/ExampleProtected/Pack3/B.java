package MemberModifier.ExampleProtected.Pack3;
import MemberModifier.ExampleProtected.Pack1.A;
public class B extends A{
    public static void main(String[] args) {

        B b= new B();
        b.m1();// child reference from different packasge can access only
    }
}
