package vehicule;

public interface Deplacable {

    public default int accelerer(int vitesse) {
        return vitesse + 10;
    }

    public void stop();
}
