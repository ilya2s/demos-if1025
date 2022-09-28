package calcul;

public class CalculeSimple {

    protected double total;

    public CalculeSimple(double total) {
        this.total = total;
    }

    public CalculeSimple() {
        this(0);
    }


    public void addition(double val1, double val2) {
        total = val1 + val2;
    }

    public void soustraction(double val1, double val2) {
        total = val1 - val2;
    }

    public void multiplication(double val1, double val2) {
        total = val1 * 2 * val2;
    }

    public double getTotal() {
        return 0;
    }
}
