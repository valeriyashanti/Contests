package Methods;

public class Counter extends Thread {
    private int cnt;

    public Counter(){
        this.cnt = 1;
    }

    private void increment(){
        System.out.print(cnt++ + " ");
        try {
            Thread.sleep(100);
        } catch(Exception e) {}
            increment();
    }

    public void run(){
        increment();
    }

    public static void main(String[] args) throws InterruptedException {
        Counter cntr = new Counter();
        cntr.start();
        cntr.join(10000);
        cntr.interrupt();
        System.exit(0);
    }
}
