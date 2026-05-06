package InterviewQuestion;



class Parent{
    String s = "Parent";
}
class Child extends Parent{
    String s = "Child";
}
// no variable overridding
// variable resolution based on reference type by compiler
class Test1{
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.s);

        Child c = new Child();
        System.out.println(c.s);

        Parent p1 = new Child();
        System.out.println(p.s);
    }
}
