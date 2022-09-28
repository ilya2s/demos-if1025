package compagnie;

public class Mathematicien extends Employe {

    private String sujet;

    public Mathematicien(String prenom, String nom, String departement, String sujet, double salaire) {
        super(prenom, nom, departement, salaire);
        this.sujet = sujet;
    }

    public Mathematicien(String prenom, String nom, String sujet, double salaire) {
        super(prenom, nom, salaire);
        this.sujet = sujet;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    @Override
    public String toString() {
        return String.format("""
                        %s (%s):
                        Département : %s
                        Sujet de maitrise : %s
                        Salaire : %.2f$
                        """, super.toString(), "Mathématicien", departement, sujet, salaire);
    }
}
