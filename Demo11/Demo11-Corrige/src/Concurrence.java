public class Concurrence {

    private static int x = 0;

    private static void increment() {
        x++;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(Concurrence::increment);
        Thread t2 = new Thread(Concurrence::increment);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(x);



    }
}
