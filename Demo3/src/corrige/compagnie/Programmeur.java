package corrige.compagnie;

public class Programmeur extends Employe {

    // Ici salaire_programmeur est static et final car il appartient à la classe et ne change pas.
    private static final double SALAIRE_PROGRAMMEUR = 150000;   // meme salaire pour tous les programmeurs


    // Constructeurs
    public Programmeur(String prenom, String nom, String departement) {
        super(prenom, nom, departement, SALAIRE_PROGRAMMEUR);
    }

    public Programmeur(String prenom, String nom) {
        super(prenom, nom, SALAIRE_PROGRAMMEUR);
    }


    // Méthode d'affichage
    @Override
    public String toString() {
        return String.format("""
                        %s (%s):
                        Département : %s
                        Salaire : %.2f$
                        """,
                super.toString(),
                "Programmeur",
                departement,
                salaire);
    }
}
