package MemberModifier.ExamplePrivate;

public class A {
    private void m1(){
        System.out.println("A class Private Method");
    }
}
class Test{
    public static void main(String[] args) {
        A a = new A();
       // a.m1();
    }
}
// private is accessible within same class
// but we are trying to access it from different claas
/*
public class A {
    private void m1(){
        System.out.println("A class Private Method");
    }

    public void callM1(){
        m1();
    }
}
class Test{
    public static void main(String[] args) {
        A a = new A();
        a.callM1();   //  correct way
    }
}
 */