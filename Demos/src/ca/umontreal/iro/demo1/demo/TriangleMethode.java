package ca.umontreal.iro.demo1.demo;

public class TriangleMethode {

    public static double hypo(TriangleRec triangle) {
        return Math.sqrt(triangle.base * triangle.base + triangle.hauteur * triangle.hauteur);
    }

    public static double aire(TriangleRec triangle) {
        return triangle.base * triangle.hauteur / 2.0;
    }

}
