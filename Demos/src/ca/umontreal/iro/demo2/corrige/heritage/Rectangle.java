package ca.umontreal.iro.demo2.corrige.heritage;

// Rectangle hérite de Forme
public class Rectangle extends Forme {
    // Constructors
    public Rectangle(int base, int hauteur) {
        super(base, hauteur);
    }

    public Rectangle() {
        this(5, 5);
    }


    // Other Methods (Implementing abstract methods from Forme)
    @Override
    public double getPerimeter() {
        return 2 * (base + hauteur);
    }

    @Override
    public double getArea() {
        return base * hauteur;
    }


    @Override
    public String toString() {
        return "Rectangle" + super.toString();
    }
}
