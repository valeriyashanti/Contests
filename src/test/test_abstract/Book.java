package test.test_abstract;

public abstract class Book implements Moveable {
    @Override
    public void fly(String a) {
        System.out.println("FLY");
    }
}
