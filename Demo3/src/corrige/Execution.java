package corrige;

import corrige.animaux.Animal;
import corrige.animaux.Chien;
import corrige.animaux.Ours;
import corrige.calcul.CalculeComplex;
import corrige.compagnie.Employe;
import corrige.compagnie.Mathematicien;
import corrige.compagnie.Programmeur;

public class Execution {

    public static void main(String[] args) {
        CalculeComplex complex1 = new CalculeComplex();      // Objet de Type CalculeComplexe

        // Addition
        complex1.addition(1, 2);
        System.out.println("Total après addition : " + complex1.getTotal());

        // Soustraction
        complex1.soustraction(4, 3);
        System.out.println("Total après soustraction : " + complex1.getTotal());

        // Multiplication
        complex1.multiplication(5, 6);
        System.out.println("Total après multiplication : " + complex1.getTotal());


        System.out.println("===========================================================");


        Animal animal_un = new Animal();
        Animal animal_deux = new Animal();
        Animal b = new Chien();
        Animal d = new Ours();

        // Type de l'animal D (Ours)
        d.getType();
        System.out.println(" OURS : La valeur de la variable static est "+d.getVariable());

        System.out.println();

        b.getType();
        System.out.println(" CHIEN La valeur de la variable static avant le changement "+b.getVariable());
        b.setVariable(10);
        System.out.println(" CHIEN La valeur de la variable static apres le changement "+b.getVariable());

        System.out.println();

        animal_un.getType();
        System.out.println(" ANIMAL UN La valeur de la variable static "+animal_un.getVariable());

        System.out.println();

        animal_deux.getType();
        System.out.println(" ANIMAL DEUX La valeur de la variable static avant le changement "+animal_deux.getVariable());
        animal_deux.setVariable(500);
        System.out.println(" ANIMAL DEUX La valeur de la variable static apres le changement "+animal_deux.getVariable());

        System.out.println();

        System.out.println(" ANIMAL UN La valeur de la variable static "+animal_un.getVariable());


        System.out.println("===========================================================");


        Employe prog1 = new Programmeur("Ilyass", "El Ouazzani", "Recherche");
        System.out.println(prog1);

        Employe math1 = new Mathematicien("Mathy", "Mc MathPants", "Actuariat",
                "regression", 100000);
        System.out.println(math1);


        // Amusez-vous à tester les différentes méthodes

    }
}
