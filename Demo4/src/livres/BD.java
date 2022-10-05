package livres;

public class BD extends Livre {

    /**
     * Attributs
     */
    private final boolean enCouleur;

    /**
     * Constructeur
     *
     * @param titre       le titre du livre
     * @param auteur      l'auteur du livre
     * @param nombrePages le nombre de pages du livre
     * @param prix        le prix de vente du livre
     */
    public BD(String titre, String auteur, int nombrePages, double prix, boolean enCouleur) {
        super(titre, auteur, nombrePages, prix);

        this.enCouleur = enCouleur;
    }


    public void acheter() {
        this.proprietaire = "Anonyme";
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf("Est en couleur : %s%n", (enCouleur ? "oui" : "non"));
    }
}
