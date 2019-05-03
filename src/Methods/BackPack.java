package Methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BackPack {

    class Item implements Comparable<Item>{
        private int cost;
        private int weight;

        public double getCostByKg() {
            return (double)cost / weight;
        }

        public int getWeight() {
            return weight;
        }

        public int getCost() {
            return cost;
        }

        public Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public int compareTo(Item o) {
            long r1 = (long)this.getCost() * o.getWeight();
            long r2 = (long)o.getCost() * this.getWeight();
            return -Long.compare(r1, r2);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new BackPack().run();
    }

    private void run() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/Methods/back.txt"));
        int n = sc.nextInt(), w = sc.nextInt();

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++){
            items[i] = new Item(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(items);
//        Arrays.sort(items, Comparator.comparing(Item::getCostByKg));

//        Arrays.sort(items, new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                double r1 = (double)o1.getCost() / o1.getWeight();
//                double r2 = (double)o2.getCost() / o2.getWeight();
//                return -Double.compare(r1, r2);
//            }
//        });


        double money = 0;
        for (int i = 0; i < items.length; i++){
            if (items[i].getWeight() <= w) {
                money += items[i].getCost();
                w -= items[i].getWeight();
            } else{
                money += (double)items[i].getCostByKg() * w;
                break;
            }
        }
        System.out.println(money);
    }
}
