package PolymorphismPractice;

class Test4{
    public void m1(int i){
        System.out.println("General Method");
    }
    public void m1(int... i){
        System.out.println("Var-arg Method");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.m1();
        t.m1(30);
        t.m1(10,20);
    }
}
