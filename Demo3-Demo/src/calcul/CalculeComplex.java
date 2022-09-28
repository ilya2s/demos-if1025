package calcul;

public class CalculeComplex extends CalculeSimple {

    public CalculeComplex(double total) {
        super(total);
    }

    public CalculeComplex() {
        super();
    }


    public void multiplication(double val1, double val2) {
        total = val1 * val2;
    }

    public double getTotal() {
        return total;
    }
}
