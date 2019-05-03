package test.test_abstract;

public class Car extends Transport {
    @Override
    public void nameMethod(int a) {
        System.out.println("Car");
    }

    @Override
    public void move() {
        System.out.println("car");
    }
}
