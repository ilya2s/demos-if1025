package ca.umontreal.iro.demo1.corrige;

import java.util.Arrays;

public class Exercice2 {

    public static void echanger(int[] tab1, int[] tab2) {
        if (tab1 == null || tab2 == null) return;

        if (tab1.length != tab2.length) return;

        for (int i = 0; i < tab1.length; i++) {
            int temp = tab1[i];
            tab1[i] = tab2[i];
            tab2[i] = temp;
        }
    }

    public static void echanger(String[] tab1, String[] tab2) {
        if (tab1 == null || tab2 == null) return;

        if (tab1.length != tab2.length) return;

        for (int i = 0; i < tab1.length; i++) {
            String temp = tab1[i];
            tab1[i] = tab2[i];
            tab2[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4};
        int[] tab2 = {5, 6 , 7, 8};

        System.out.println("Avant echange :");
        System.out.println("TAB 1 : " + Arrays.toString(tab1));
        System.out.println("TAB 2 : " + Arrays.toString(tab2));
        System.out.println("=============================");

        echanger(tab1, tab2);

        System.out.println("Après echange :");
        System.out.println("TAB 1 : " + Arrays.toString(tab1));
        System.out.println("TAB 2 : " + Arrays.toString(tab2));
        System.out.println("=============================");

        String[] tab3 = {"Hello", "Java", "!"};
        String[] tab4 = {"Bonjour", "IFT", "1025"};

        System.out.println("Avant echange :");
        System.out.println("TAB 3 : " + Arrays.toString(tab3));
        System.out.println("TAB 4 : " + Arrays.toString(tab4));
        System.out.println("=============================");

        echanger(tab3, tab4);

        System.out.println("Apres echange :");
        System.out.println("TAB 3 : " + Arrays.toString(tab3));
        System.out.println("TAB 4 : " + Arrays.toString(tab4));
        System.out.println("=============================");

    }
}
