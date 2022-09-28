package ca.umontreal.iro.demo1.demo;

public class Exercice6 {

    public static void main(String[] args) {
        // TriangleRec t1 = new TriangleRec(10, 5);
        TriangleRec t2 = new TriangleRec();

        //System.out.println("T1 : " + t1);
        System.out.println("T2 : " + t2);

        //double h1 = TriangleMethode.hypo(t1);
        //System.out.printf("L'hypo de t1 est : %.2f", h1);

        double h2 = TriangleMethode.hypo(t2);
        System.out.printf("\nL'hypo de t2 est : %.2f", h2);

        //double a1 = TriangleMethode.aire(t1);
        //System.out.printf("\nL'aire de t1 est : %.2f", a1);

        double a2 = TriangleMethode.aire(t2);
        System.out.printf("\nL'aire de t2 est : %.2f", a2);

        //System.out.println(t1.getBase());

    }
}
