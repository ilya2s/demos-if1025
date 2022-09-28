package ca.umontreal.iro.demo1.demo;

import ca.umontreal.iro.demo1.corrige.Exercice4;

import java.util.ArrayList;
import java.util.List;

public class Exercice5 {

    public static List<String> trier(String[] list) {
        List<String> t = new ArrayList<>();
        for (String s : list) {
            Exercice4.insert(t, s);
        }

        return t;
    }

    public static void main(String[] args) {
        String[] t1 = {"Java", "Bonjour", "Aujourd'hui", "IFT"};

        List<String> l1 = trier(t1);

        System.out.println(l1);
    }
}
