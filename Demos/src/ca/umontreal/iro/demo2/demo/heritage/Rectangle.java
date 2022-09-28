package ca.umontreal.iro.demo2.demo.heritage;

public class Rectangle extends Forme {

    public Rectangle(int base, int hauteur) {
        super(base, hauteur);
    }

    public Rectangle() {
        super();
        setBase(3);
        setHauteur(4);
    }
}
