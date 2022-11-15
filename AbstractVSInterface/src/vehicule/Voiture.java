package vehicule;

public class Voiture extends Vehicule {

    private int nb_roues;

    public Voiture(int nb_roues) {
        super(0);
        this.nb_roues = 4;
    }


    public int getNb_roues() {
        return nb_roues;
    }

    public void setNb_roues(int nb_roues) {
        this.nb_roues = nb_roues;
    }

    @Override
    public void stop() {
        vitesseMOyenne = 0;
    }

    @Override
    public int accelerer(int vitesse) {
        return vitesse + 10;
    }
}
