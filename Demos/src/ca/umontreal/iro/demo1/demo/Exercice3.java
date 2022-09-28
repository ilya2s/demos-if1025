package ca.umontreal.iro.demo1.demo;

import java.util.Arrays;

public class Exercice3 {

    public static int[] multiplier(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int e = tab[i] * (int) (Math.random() * 10);
            tab[i] -= e;
        }

        int[] temp = tab.clone();
        return temp;
    }

    public static void main(String[] args) {

        int[] t1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] t2 = multiplier(t1);

        System.out.println("t1 : " + Arrays.toString(t1));
        System.out.println("t2 : " + Arrays.toString(t2));


        System.out.println(t1);
        System.out.println(t2);



    }

}
