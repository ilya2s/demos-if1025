package ca.umontreal.iro.demo1.corrige;

import java.util.ArrayList;
import java.util.List;

public class Exercice5 {

    public static List<String> trier(String[] tab) {
        List<String> list = new ArrayList<>();

        for (String s : tab) {
            Exercice4.insert(list, s);
        }

        return list;
    }

    public static void main(String[] args) {
        String[] t1 = {"Java", "Bonjour", "Aujourd'hui", "IFT"};

        List<String> l1 = trier(t1);

        System.out.println(l1);


    }
}
