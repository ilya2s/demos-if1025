package ca.umontreal.iro.demo2.demo.sansHeritage;

public class Carre {

    private int base;
    private int hauteur;

    public Carre(int cote) {
        base = cote;
        hauteur = cote;
    }

    public Carre() {
        this(5);
    }

    public int getCote() {
        return base;
    }

    public void setCote(int cote) {
        base = cote;
        hauteur = cote;
    }


    public double getPerimetre() {
        return 2 * (base + hauteur);
    }

    public double getAire() {
        return base * hauteur;
    }

    @Override
    public String toString() {
        return "Carré de coté " + base;
    }
}
