package ca.umontreal.iro.demo1.corrige;

public class TriangleRec {

    public int base;
    public int hauteur;

    public TriangleRec(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public TriangleRec() {
        this(4, 3);
    }


    @Override
    public String toString() {
        return "TriangleRec{" +
                "base=" + base +
                ", hauteur=" + hauteur +
                '}';
    }
}
