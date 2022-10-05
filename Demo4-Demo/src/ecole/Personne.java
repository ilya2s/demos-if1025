package ecole;

public class Personne {
    protected String nom;
    protected int age;
    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfo() {
        System.out.println("nom: "+this.nom);
        System.out.println("Age: "+this.age);
    }

}
