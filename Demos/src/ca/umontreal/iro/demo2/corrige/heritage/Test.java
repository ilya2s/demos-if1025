package ca.umontreal.iro.demo2.corrige.heritage;

public class Test {
    private int base;
    private int hauteur;

    private boolean b;

    private String s;

    @Override
    public String toString() {
        return base + " " + hauteur + " " + b + "s -> " + s;
    }
}
