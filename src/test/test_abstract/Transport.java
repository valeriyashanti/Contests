package test.test_abstract;

public abstract class Transport implements Moveable {
    public String name;

    public void nameMethod(int a) {
        System.out.println(name);
    }

    @Override
    public void fly(String data) {
        System.out.println("ALL FLIES");
    }
}
