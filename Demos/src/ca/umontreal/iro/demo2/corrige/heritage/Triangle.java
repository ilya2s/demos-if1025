package ca.umontreal.iro.demo2.corrige.heritage;

// Triangle hérite de forme
public class Triangle extends Forme {
    // Constructors
    public Triangle(int base, int hauteur) {
        super(base, hauteur);
    }

    public Triangle() {
        this(3, 4);
    }


    // Other Methods
    public double getHypo() {
        return Math.sqrt(base * base + hauteur * hauteur);
    }

    // Other Methods (Implementing abstract methods from Forme)
    @Override
    public double getPerimeter() {
        return base + hauteur + getHypo();
    }

    @Override
    public double getArea() {
        return base * hauteur / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle" + super.toString();
    }
}
