package MemberModifier.CaseStudy1.Pack1;

public class A {
    public void m1(){
        System.out.println("A class Method");
    }
}
// if class b from package 2 want to access class A
// class A - public
// m1 - public
// both public then m1 can accessible from any package
// if any one of them not public will recieve error
// if public remove from classA it will become default which is accessible in only same package

