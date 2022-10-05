import ecole.Etudiant;
import ecole.Personne;
import livres.BD;
import livres.Coloriage;
import livres.Livre;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("charles", 20, "informatique", 1256); // LIGNE 1
        Personne personne = new Personne("Roger", 20); // LIGNE 2

        System.out.println("Etudiant 1"); // LIGNE 3
        personne = etudiant; // LIGNE 4
        personne.afficherInfo(); // LIGNE 5
        personne.afficherInfo(); // LIGNE 6

        System.out.println("\nEtudiant 2"); // LIGNE 7
        Personne personne2 = new Etudiant("Christina", 20, "genie", 1256); // LIGNE 8
        personne2.afficherInfo(); // LIGNE 9
        personne2.afficherInfo(); // LIGNE 10

        System.out.println("\n Etudiant 3"); // LIGNE 11
        Personne personne3 = new Personne("Pierre", 20); // LIGNE 12
        Etudiant etudiant3 = new Etudiant("Simon", 20, "Science", 1256); // LIGNE 13

        // etudiant3 = (Etudiant) personne3; // LIGNE 14
        etudiant3.afficherInfo(); // LIGNE 15
        etudiant3.afficherInfo(); // LIGNE 16

        System.out.println("\n Etudiant 4"); // LIGNE 17
        Personne personne4 = new Etudiant("Maude", 20, "informatique", 1256); // LIGNE 18
        Etudiant etudiant4 = (Etudiant) personne4; // LIGNE 19
        etudiant4.afficherInfo(); // LIGNE 20
        etudiant4.afficherInfo(); // LIGNE 21

        personne4.afficherInfo(); // LIGNE 22
        personne4.afficherInfo(); // LIGNE 23


        Personne p1 = new Etudiant("John", 20, "IFT", 1235);
        Etudiant e1 = (Etudiant) p1;

        e1.afficherInfo();
    }
}
