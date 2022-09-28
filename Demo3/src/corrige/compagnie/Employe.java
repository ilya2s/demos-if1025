package corrige.compagnie;

public abstract class Employe {

    // Attributs
    protected String prenom;
    protected String nom;
    protected String departement;
    protected double salaire;

    // Constructeur
    public Employe(String prenom, String nom, String departement, double salaire) {
        this.prenom = prenom;
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public Employe(String prenom, String nom, double salaire) {
        this(prenom, nom, "general", salaire);
    }


    // Getters
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }

    public String getDepartement() {
        return departement;
    }

    public double getSalaire() {
        return salaire;
    }


    // Setters
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    // Méthode d'affichage
    @Override
    public String toString() {
        return getNomComplet();
    }
}
