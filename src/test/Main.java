package test;

import test.test_abstract.Airplane;
import test.test_abstract.Car;
import test.test_abstract.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        c.addObserver(a);
        c.addObserver(b);
        c.addObserver(d);
        c.incrementA();
        c.incrementA();*/

        Transport car = new Car();
        Transport airplane = new Airplane();
        car.nameMethod(2);
        airplane.nameMethod(3);
        car.move();
        airplane.move();
        List<String> stringList =  new ArrayList<>();
        stringList.add("5");
    }

}
