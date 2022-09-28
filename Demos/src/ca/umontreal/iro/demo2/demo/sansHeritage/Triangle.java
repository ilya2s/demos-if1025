package ca.umontreal.iro.demo2.demo.sansHeritage;

public class Triangle {

    private int base;
    private int hauteur;

    public Triangle(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public Triangle() {
        this(4, 3);
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

    public double getHypo() {
        return Math.sqrt(base * base + hauteur * hauteur);
    }


    public double getPerimetre() {
        return base + hauteur + getHypo();
    }

    public double getAire() {
        return base * hauteur / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle de base " + base + " et de hauteur " + hauteur;
    }
}
