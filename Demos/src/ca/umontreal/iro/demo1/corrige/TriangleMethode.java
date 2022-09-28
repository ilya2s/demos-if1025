package ca.umontreal.iro.demo1.corrige;

public class TriangleMethode {

    public static double hypo(TriangleRec triange) {
        return Math.sqrt(triange.base * triange.base + triange.hauteur * triange.hauteur);
    }

    public static double aire(TriangleRec triangle) {
        return triangle.base * triangle.hauteur / 2.0;
    }
}
