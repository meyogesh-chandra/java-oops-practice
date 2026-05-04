package Abstractclass;

abstract class vehicle{
    public abstract int getnoOfWheel();
}
class bus extends vehicle{
    @Override
    public int getnoOfWheel() {
        return 6;
    }
}
class auto extends vehicle{
    @Override
    public int getnoOfWheel() {
        return 3;
    }
}
