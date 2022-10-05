package livres;

public class Coloriage extends Livre {

    /**
     * Attributs
     */
    boolean[] pagesColoriees;


    /**
     * Constructeur
     *
     * @param titre       le titre du livre
     * @param auteur      l'auteur du livre
     * @param nombrePages le nombre de pages du livre
     * @param prix        le prix de vente du livre
     */
    public Coloriage(String titre, String auteur, int nombrePages, double prix) {
        super(titre, auteur, nombrePages, prix);

        pagesColoriees = new boolean[nombrePages];
    }

    public void colorier(int page) {
        if (pagesColoriees[page]) {
            System.out.println("La page est déjà coloriée");
            return;
        }

        if (!estNeuf()) {
            System.out.println("Vous ne pouvez pas colorier un livre neuf");
            return;
        }
        pagesColoriees[page] = true;
    }

    @Override
    public void afficher() {
        StringBuilder pages = new StringBuilder();

        for (int i = 0; i < nombrePages; i++) {
            if (pagesColoriees[i]) {
                pages.append(i).append(" ");
            }
        }

        System.out.printf("Pages coloriées : %s", pages);
    }
}
