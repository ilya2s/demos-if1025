package ca.umontreal.iro.demo1.corrige;

public class Exercice1 {

    public static void main(String[] args) {

        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i);

                if (i < 20) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        System.out.println("=========================");

        for (int i = 0; i < 21; i += 2) {
            System.out.print(i);

            if (i < 20) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("=========================");

        int i = 0;

        for ( ; i < 21; i+= 2) {
            System.out.print(i);

            if (i < 20) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("=========================");

        System.out.println("i = " + i);
        System.out.println("=========================");


        for (int j = 0; j < 21; ) {
            System.out.print(j);

            if (j < 20) {
                System.out.print(", ");
            }

            j += 2;
        }

    }
}
