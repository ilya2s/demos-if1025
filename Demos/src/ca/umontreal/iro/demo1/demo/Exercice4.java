package ca.umontreal.iro.demo1.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercice4 {

    public static List<String> insert(List<String> list, String mot) {
        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i);

            if (mot.compareTo(s) <= 0) {
                list.add(i, mot);
                return list;
            }
        }

        list.add(mot);
        return list;
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("arbre");
        l1.add("bateau");
        l1.add("dauphin");

        String m = "couteau";

        System.out.println("L1 : " + l1);

        List<String> l2 = insert(l1, m);

        System.out.println("L2 : " + l2);

        List<String> l3 = insert(l2, "animal");

        System.out.println("L2 : " + l3);

        System.out.println("=================================");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
