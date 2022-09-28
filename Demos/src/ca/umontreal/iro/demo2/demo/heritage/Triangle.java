package ca.umontreal.iro.demo2.demo.heritage;

public class Triangle extends Forme {

    public Triangle(int base, int hauteur) {
        super(base, hauteur);
    }

    public Triangle() {
        setBase(6);
        setHauteur(9);
    }

    public double getHypo() {
        return Math.sqrt(getBase() * getBase() + getHauteur() * getHauteur());
    }

    @Override
    public double getPerimetre() {
        return getBase() + getHauteur() + getHypo();
    }

    @Override
    public double getAire() {
        return super.getAire() / 2;
    }
}
