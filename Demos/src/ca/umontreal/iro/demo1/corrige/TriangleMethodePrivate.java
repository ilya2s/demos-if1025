package ca.umontreal.iro.demo1.corrige;

public class TriangleMethodePrivate {

    public static double hypo(TriangleRecPrivate triangle) {
        int base = triangle.getBase();
        int hauteur = triangle.getHauteur();

        return Math.sqrt(base * base + hauteur * hauteur);
    }

    public static double aire(TriangleRecPrivate triangle) {
        int base = triangle.getBase();
        int hauteur = triangle.getHauteur();

        return base * hauteur / 2.0;
    }
}
