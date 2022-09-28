package ca.umontreal.iro.demo1.demo;

public class TriangleRec {
    public int base;
    public int hauteur;

    private TriangleRec(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public TriangleRec() {
        this(4, 3);
    }

    public int getBase() {
        return base;
    }

    public int getHauteur() {
        return hauteur;
    }




    @Override
    public String toString() {
        return "TriangleRec{" +
                "base=" + base +
                ", hauteur=" + hauteur +
                '}';
    }
}
