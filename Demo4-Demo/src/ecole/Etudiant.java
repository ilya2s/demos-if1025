package ecole;

public class Etudiant extends Personne  {

    public String programme;
    public int student_id;
    public Etudiant(String name, int age, String branch, int Student_id){
        super(name, age);
        this.programme = branch;
        this.student_id = Student_id;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Nom: "+this.nom);
        System.out.println("Age: "+this.age);
        System.out.println("Programme: "+this.programme);
        System.out.println("Student ID: "+this.student_id);
    }
}
