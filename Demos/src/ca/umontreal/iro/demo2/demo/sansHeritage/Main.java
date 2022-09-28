package ca.umontreal.iro.demo2.demo.sansHeritage;

public class Main {

    public static void main(String[] args) {
        Carre c1 = new Carre(2);
        Carre c2 = new Carre(7);
        Carre c3 = new Carre();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("==================================================");

        System.out.println("Longueur des cotés de C1 : " + c1.getCote());
        System.out.println("Longueur des cotés de C2 : " + c2.getCote());
        System.out.println("Longueur des cotés de C3 : " + c3.getCote());

        System.out.println("==================================================");

        c1.setCote(4);
        c2.setCote(6);
        c3.setCote(9);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("==================================================");

        System.out.println("Perimetre de C1 : " + c1.getPerimetre());
        System.out.println("Aire de C2 : " + c2.getAire());

        System.out.println("\n*********************************************************");
        System.out.println("*********************************************************");

        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2  = new Rectangle(3, 4);
        Rectangle r3 = new Rectangle();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("==================================================");

        System.out.println("Perimetre de R1 : " + r1.getPerimetre());
        System.out.println("Aire de T2 : " + r2.getAire());

        System.out.println("\n*********************************************************");
        System.out.println("*********************************************************");

        Triangle t1 = new Triangle(1, 2);
        Triangle t2 = new Triangle();

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("==================================================");

        System.out.printf("Perimetre de T1 : %.2f\n", t1.getPerimetre());
        System.out.printf("Aire de T2 : %.2f\n", t2.getAire());


        BankAccount b1  = new BankAccount();
    }
}
