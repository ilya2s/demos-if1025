package ca.umontreal.iro.demo2.demo.heritage;

public abstract class Forme {
    // Attributs
    private int base;
    private int hauteur;

    // Constructeurs
    public Forme(int base, int hauteur) {
        this.setBase(base);
        this.setHauteur(hauteur);
    }

    public Forme() {
        setBase(0);
        setHauteur(0);
    }


    // Getters
    public int getBase() {
        return base;
    }

    public int getHauteur() {
        return hauteur;
    }


    // Setters
    public void setBase(int base) {
        this.base = base;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public double getPerimetre() {
        return 2 * (getBase() + getHauteur());
    }

    public double getAire() {
        return getBase() * getHauteur();
    }
}
