package ca.umontreal.iro.demo1.corrige;

public class ExecTriangle {

    public static void main(String[] args) {
        TriangleRec t1 = new TriangleRec(10, 5);
        TriangleRec t2 = new TriangleRec();

        System.out.println("T1 : " + t1);
        System.out.println("T2 : " + t2);

        double h1 = TriangleMethode.hypo(t1);
        System.out.printf("L'hypo de t1 est : %.2f", h1);

        double h2 = TriangleMethode.hypo(t2);
        System.out.printf("\nL'hypo de t2 est : %.2f", h2);

        double a1 = TriangleMethode.aire(t1);
        System.out.printf("\nL'aire de t1 est : %.2f", a1);

        double a2 = TriangleMethode.aire(t2);
        System.out.printf("\nL'aire de t2 est : %.2f", a2);

        TriangleRecPrivate p1 = new TriangleRecPrivate(10, 5);
        TriangleRecPrivate p2 = new TriangleRecPrivate();

        System.out.println("\nP1 : " + p1);
        System.out.println("P2 : " + p2);

        double h3 = TriangleMethodePrivate.hypo(p1);
        System.out.printf("L'hypo de p1 est : %.2f", h3);

        double h4 = TriangleMethodePrivate.hypo(p2);
        System.out.printf("\nL'hypo de p2 est : %.2f", h4);

        double a3 = TriangleMethodePrivate.aire(p1);
        System.out.printf("\nL'aire de p1 est : %.2f", a3);

        double a4 = TriangleMethodePrivate.aire(p2);
        System.out.printf("\nL'aire de p2 est : %.2f", a4);



    }
}
