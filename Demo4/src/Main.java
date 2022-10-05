import livres.BD;
import livres.Coloriage;
import livres.Livre;

public class Main {

    public static void main(String[] args) {

        // Un livre
        Livre l1 = new Livre("Les misérables", "Victor Hugo", 365, 17.59);
        l1.afficher();  // Afficher les attributs du livre
        System.out.println();

        System.out.println("Neuf ? : " + l1.estNeuf());   // est-il neuf ?

        l1.acheter("Ilyass El Ouazzani");   // J'achète le livre
        System.out.println();

        l1.afficher(); // afficher le livre encore
        System.out.println();

        System.out.println("Neuf ? : " + l1.estNeuf());   // est-il neuf maintenant ?

        System.out.println("=====================================================");



        // Une BD
        BD bd1 = new BD("Batman : Arkham Night", "Jonh Snow", 50, 25, true);
        bd1.afficher();
        System.out.println();

        System.out.println("Neuf ? : " + bd1.estNeuf());  // est-elle neuve ?

        bd1.acheter();  // Un acheteur anonyme achete la BD
        System.out.println();

        bd1.afficher(); // Afficher la BD
        System.out.println();

        System.out.println("Neuf ? : " + bd1.estNeuf());  // est-elle neuve encore ?

        System.out.println("===========================================================");




        BD bd2 = new BD("The Man of Steel", "Tony Montana", 50, 25, false);
        bd2.afficher();
        System.out.println();

        System.out.println("Neuf ? : " + bd2.estNeuf());  // est-elle neuve ?

        bd2.acheter();  // Un acheteur anonyme achete la BD
        System.out.println();

        bd2.afficher(); // Afficher la BD
        System.out.println();

        System.out.println("Neuf ? : " + bd2.estNeuf());  // est-elle neuve encore ?

        System.out.println("=============================================================");



        Coloriage c1 = new Coloriage("Color Along", "Obiwan Kenobi", 10, 45);
        c1.afficher();
        System.out.println();

        c1.colorier(5);
        c1.colorier(9);

        c1.afficher();

    }
}
