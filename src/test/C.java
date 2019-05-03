package test;

import java.util.ArrayList;
import java.util.List;

public class C {
    private List<Updateble> updatebles;
    public static int a;

    public C() {
        updatebles = new ArrayList<>(2);
    }

    public void addObserver(Updateble observer) {
        updatebles.add(observer);
    }

    public void incrementA() {
        a++;
        if (a > 1) {
            for (Updateble upd : updatebles)
                upd.update();
        }
    }

}
