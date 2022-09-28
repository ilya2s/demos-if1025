package ca.umontreal.iro.demo2.demo.sansHeritage;

public class Rectangle {

    private int base;
    private int hauteur;

    public Rectangle(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public Rectangle() {
        this(5, 5);
    }


    public int getBase() {
        return base;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public double getPerimetre() {
        return 2 * (base + hauteur);
    }

    public double getAire() {
        return base * hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle de base " + base + " et de hauteur " + hauteur;
    }
}
