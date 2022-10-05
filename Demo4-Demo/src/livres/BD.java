package livres;

public class BD extends Livre {

    private final boolean enCouleur;

    public BD(String titre, String auteur, int nbPages, double prix, boolean enCouleur) {
        super(titre, auteur, nbPages, prix);

        this.enCouleur = enCouleur;
    }

    @Override
    public void acheter() {
        proprietaire = "Anonyme";
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf("Est en couleur ? : %b", enCouleur);
    }
}
