package corrige.calcul;

public class CalculeSimple {

    // Attributs
    protected double total;


    // Constructeurs
    public CalculeSimple(double total) {
        this.total = total;
    }

    public CalculeSimple() {
        this(0);
    }


    // Méthodes
    public void addition(double val1, double val2) {
        total = val1 + val2;
    }

    public void soustraction(double val1, double val2) {
        total = val1 - val2;
    }
}
