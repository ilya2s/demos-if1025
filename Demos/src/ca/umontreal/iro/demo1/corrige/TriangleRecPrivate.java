package ca.umontreal.iro.demo1.corrige;

public class TriangleRecPrivate {

    private int base;
    private int hauteur;

    public TriangleRecPrivate(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public TriangleRecPrivate() {
        this(3, 4);
    }

    public int getBase() {
        return base;
    }

    public int getHauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return "TriangleRecPrivate{" +
                "base=" + base +
                ", hauteur=" + hauteur +
                '}';
    }
}
