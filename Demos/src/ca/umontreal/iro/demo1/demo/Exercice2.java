package ca.umontreal.iro.demo1.demo;

import java.util.Arrays;

public class Exercice2 {

    public static void echange(int[] t1, int[] t2) {
        for (int i = 0; i < t1.length; i++) {
            int temp = t1[i];
            t1[i] = t2[i];
            t2[i] = temp;
        }
    }

    public static void echange(String[] t1, String[] t2) {
        for (int i = 0; i < t1.length; i++) {
            String temp = t1[i];
            t1[i] = t2[i];
            t2[i] = temp;
        }
    }



    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4};
        int[] tab2 = {5, 6, 7, 8};

        System.out.println("Avant echange :");
        System.out.println("TAB 1 : " + Arrays.toString(tab1));
        System.out.println("TAB 2 : " + Arrays.toString(tab2));
        System.out.println("=============================");

        echange(tab1, tab2);

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

        echange(tab3, tab4);

        System.out.println("Apres echange :");
        System.out.println("TAB 3 : " + Arrays.toString(tab3));
        System.out.println("TAB 4 : " + Arrays.toString(tab4));
        System.out.println("=============================");



    }
}
