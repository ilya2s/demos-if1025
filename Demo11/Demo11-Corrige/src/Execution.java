public class Execution {

    public static void main(String[] args) {
        ComputePi pi1 = new ComputePi(0, 300000000);
        ComputePi pi2 = new ComputePi(300000000, 600000000);

        Runnable r1 = pi1::compute;
        Runnable r2 = pi2::compute;

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(pi1.getPartialSum() + pi2.getPartialSum());
    }
}
