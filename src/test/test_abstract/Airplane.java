package test.test_abstract;

public class Airplane extends Transport {
    @Override
    public void nameMethod(int a) {
        System.out.println("Airplane");
    }

    @Override
    public void move() {
        System.out.println("Air");
    }

    @Override
    public void fly(String s) {
        super.fly(s);
        System.out.println("GAAHHA");
    }


}
