package ca.umontreal.iro.demo2.corrige.sansHeritage;

public class Triangle {

    // Attributes
    private int base;
    private int hauteur;

    // Constructors
    public Triangle(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public Triangle() {
        this(4, 3);
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
    public double getHypo() {
        return Math.sqrt(base * base + hauteur * hauteur);
    }

    public double getPerimeter() {
        return base + hauteur + getHypo();
    }

    public double getArea() {
        return base * hauteur / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle de base " + base + " et de hauteur " + hauteur;
    }
}
