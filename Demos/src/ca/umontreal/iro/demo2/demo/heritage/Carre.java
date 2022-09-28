package ca.umontreal.iro.demo2.demo.heritage;

public class Carre extends Forme {

    public Carre(int cote) {
        super(cote, cote);
    }

    public Carre() {
        setBase(5);
        setHauteur(5);
    }
}
