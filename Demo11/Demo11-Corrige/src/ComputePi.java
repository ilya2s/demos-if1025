public class ComputePi {
    private final int from, to;
    private double partialSum;

    public ComputePi(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public double getPartialSum() {
        return partialSum;
    }

    public void compute() {
        double pi = 0;

        for (int i = from; i < to; i++) {
            pi += Math.pow(-1, i) * 4 / (2 * i + 1);
        }

        partialSum = pi;
    }

}
