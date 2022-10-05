package livres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coloriage extends Livre {

    private boolean[] pagesColoriees;

    public Coloriage(String titre, String auteur, int nbPages, double prix) {
        super(titre, auteur, nbPages, prix);

        pagesColoriees = new boolean[nbPages];
    }

    public void colorier(int page) {
        if (estNeuf()) {
            System.out.println("On ne peut pas colorier un livre neuf");
        } else if (pagesColoriees[page - 1]){
            System.out.println("La page est déja coloriée");
        } else {
            pagesColoriees[page - 1] = true;
        }
    }

    @Override
    public void afficher() {
        super.afficher();

        List<Integer> coloriess = new ArrayList<>();

        for (int i = 0; i < pagesColoriees.length; i++) {
            if (pagesColoriees[i]) {
                coloriess.add(i + 1);
            }
        }


        System.out.printf("Pages colories : %s", coloriess);
    }
}
