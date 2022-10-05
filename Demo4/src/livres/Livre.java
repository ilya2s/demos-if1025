package livres;

public class Livre {

    /**
     * Attributs
     */
    protected String titre;
    protected String auteur;
    protected int nombrePages;
    protected String proprietaire;
    protected double prix;

    /**
     * Constructeur
     *
     * @param titre le titre du livre
     * @param auteur l'auteur du livre
     * @param nombrePages le nombre de pages du livre
     * @param prix le prix de vente du livre
     */
    public Livre(String titre, String auteur, int nombrePages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.prix = prix;
        proprietaire = null;
    }

    public boolean estNeuf() {
        return (proprietaire == null);
    }

    public void acheter(String nomAcheteur) {
        proprietaire = nomAcheteur;
    }

    public void afficher() {
        String proprio = proprietaire == null ? "aucun propriétaire" : proprietaire;

        System.out.printf("""
                Titre : %s (%d pages)
                Auteur : %s
                Prix : %.2f$
                Propriétaire : %s
                """, titre, nombrePages, auteur, prix, proprio);
    }

}
