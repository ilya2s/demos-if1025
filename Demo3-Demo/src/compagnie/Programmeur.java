package compagnie;

public class Programmeur extends Employe {

    private final static double SALAIRE_PROGRAMMEUR = 250000;

    public Programmeur(String prenom, String nom, String departement) {
        super(prenom, nom, departement, SALAIRE_PROGRAMMEUR);
    }

    public Programmeur(String prenom, String nom) {
        super(prenom, nom, SALAIRE_PROGRAMMEUR);
    }

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
