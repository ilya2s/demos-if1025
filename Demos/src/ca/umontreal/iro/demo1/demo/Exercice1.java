package ca.umontreal.iro.demo1.demo;

public class Exercice1 {

    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.print(i);

                if (i < 19) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();

        int i = 0;
        for ( ; i< 21; ) {
            System.out.print(i);
            System.out.print(", ");

            i++;
        }
    }
}
