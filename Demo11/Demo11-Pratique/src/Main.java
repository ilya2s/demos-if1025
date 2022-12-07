public class Main {

    public static void main(String[] args) {
        ComputePi pi1 = new ComputePi(0, 300000000);
        ComputePi pi2 = new ComputePi(300000000, 600000000);

        Thread t1 = new Thread(pi1::compute);
        Thread t2 = new Thread(pi2::compute);

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
