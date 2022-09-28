package ca.umontreal.iro.demo2.corrige.sansHeritage;

public class Carre {
    // Attributes
    private int cote;


    // Constructors
    public Carre(int cote) {
        this.cote = cote;
    }

    public Carre() {
        this(5);
    }


    // Getters
    public int getCote() {
        return cote;
    }

    // Setters
    public void setCote(int cote) {
        this.cote = cote;
    }

    // Other Methods
    public int getPerimeter() {
        return cote * 4;
    }

    public int getArea() {
        return cote * cote;
    }

    @Override
    public String toString() {
        return "Carré avec cotés de longueur : " + cote;
    }
}
