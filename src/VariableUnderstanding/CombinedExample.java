package VariableUnderstanding;

class Demo {
    int a = 10;          // instance
    static int b = 20;   // static

    void show() {
        int c = 30;      // local
        System.out.println(a + " " + b + " " + c);
    }
}

