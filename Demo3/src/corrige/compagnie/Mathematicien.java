package corrige.compagnie;

public class Mathematicien extends Employe {

    private String sujet;   // Sujet de maitrise du mathématicien


    // Constructeurs
    public Mathematicien(String prenom, String nom, String departement, String sujet, double salaire) {
        super(prenom, nom, departement, salaire);
        this.sujet = sujet;
    }

    public Mathematicien(String prenom, String nom, String sujet, double salaire) {
        super(prenom, nom, salaire);
        this.sujet = sujet;
    }


    // Getter
    public String getSujet() {
        return sujet;
    }


    // Setter
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }


    // Méthode d'affichage
    @Override
    public String toString() {
        return String.format("""
                        %s (%s):
                        Département : %s
                        Sujet de maitrise : %s
                        Salaire : %.2f$
                        """,
                super.toString(),
                "Mathématicien",
                departement,
                sujet,
                salaire);
    }
}
