package ca.umontreal.iro.demo2.corrige.heritage;

// Carre hérite de Rectangle
public class Carre extends Rectangle {
    // Constructors
    public Carre(int cote) {
        super(cote, cote);
    }

    public Carre() {
        this(5);
    }


    // Getters
    public int getCote() {
        return base;
    }


    // Setters
    public void setCote(int cote) {
        base = cote;
        hauteur = cote;
    }

    @Override
    public String toString() {
        return "Carre de cote " + base;
    }

    /*
    Ici pas besoin de redéfinir getPerimetre() et getArea() puisque qu'il va heriter ces methodes de Rectangle
    Et les etapes pour calculer l'aire et le perimetre d'un rectangle sont les memes que pour un carré
     */
}
