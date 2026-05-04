package Abstractclass;

abstract class Test{
    public abstract void m1();
    public abstract void m2();
    // this is abstract class so its object can not be created
    // its abstract method will be implemented by child class

}
abstract class SubTest extends Test1
{
    public void m1(){

    }
// i have no implementation for m2 declare subtest as abstract
    // next child class will give implementation for m2()
}