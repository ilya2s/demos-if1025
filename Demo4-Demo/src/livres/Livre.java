package livres;

public class Livre {

    protected String titre;
    protected String auteur;
    protected int nbPages;
    public String proprietaire;
    protected double prix;


    public Livre(String titre, String auteur, int nbPages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.prix = prix;
    }


    public boolean estNeuf() {
        return (proprietaire == null);
    }

    public void acheter(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void acheter() {
        proprietaire = "Prof. Nie";
    }

    public void afficher() {
        String proprio = (estNeuf()) ? "aucun propriétaire" : proprietaire;

        System.out.printf("""
                Titre : %s (%d pages)
                Auteur : %s
                Prix : %.2f$
                Proprietaire : %s    
                """, titre, nbPages, auteur, prix, proprio);
    }
}
