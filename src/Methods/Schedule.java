package Methods;

import java.util.*;

public class Schedule { // UGH
    public static void main(String[] args) {
        new Schedule().run();
    }

    private void run() {
        System.out.println(GetSchedule());
    }

    class Item{
        private int start;
        private int end;

        public int getStart() { return start; }

        public int getEnd() { return end; }

        public Item(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private int GetSchedule() {
        Scanner sc = new Scanner(System.in);
        int n = 0, am;
        am = sc.nextInt();
        Item[] items = new Item[am];
        for (int i = 0; i < am; i++) {
            items[i] = new Item(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(items, Comparator.comparing(Item::getEnd));

        int time = 0;
        for (int i = 0; i < am; i++) {
            if (items[i].getStart() >= time){
                time = items[i].getEnd();
                n++;
            }
        }
        return n;
    }
}
