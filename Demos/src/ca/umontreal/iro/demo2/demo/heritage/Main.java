package ca.umontreal.iro.demo2.demo.heritage;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4);
        System.out.println(t1.getPerimetre());
        System.out.println(t1.getAire());

        System.out.println("========================================");

        Rectangle r1 = new Rectangle(1, 4);

        r1.setHauteur(5);
        System.out.println(r1.getPerimetre());
        System.out.println(r1.getAire());

    }
}
