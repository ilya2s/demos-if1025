package ca.umontreal.iro.demo2.corrige.heritage;

public abstract class Forme {
    // Attributes
    protected int base;
    protected int hauteur;


    // Constructor
    public Forme(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }


    // Getters
    public int getBase() {
        return this.base;
    }

    public int getHauteur() {
        return this.hauteur;
    }


    // Setters
    public void setBase(int base) {
        this.base = base;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }


    // Other Methods
    public abstract double getPerimeter();

    public abstract double getArea();


    // Redéfinir toString() pour l'affichage
    @Override
    public String toString() {
        return " de base " + base + " et de hauteur " + hauteur;
    }
}
