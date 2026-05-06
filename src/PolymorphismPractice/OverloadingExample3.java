package PolymorphismPractice;

class Test3{
    public void m1(String s){
        System.out.println("String version");
    }
    public void m1(StringBuffer sb){
        System.out.println("String Buffer version");
    }

    public static void main(String[] args) {
        Test3 t =new Test3();
        t.m1("yogesd");
        t.m1(new StringBuffer("sonu"));
        //t.m1(null); error
    }
}
