package PolymorphismPractice;

class p1{
    public Object m1(){
        return null;
    }
}
// java 1.5
//co varient concept
class c extends p1{
    public String m1(){
        return null;
    }
}