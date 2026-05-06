package InterfaceExamples;

interface interf{
    public void m1();
    public void m2();
}
class service implements interf{
    public void m1(){

    }
    public void m2(){

    }
}
// if any class implements interface it should declare all method
// if not then declare class as abstract

abstract class serviceprovider implements interf{
    public void m1(){

    }
}
