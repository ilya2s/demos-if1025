import vehicule.Vehicule;
import vehicule.Voiture;

public class Main {

    public static void main(String[] args) {

        Voiture v1 = new Voiture(4);
        Voiture v2 = new Voiture(2);

        System.out.println(v1.getNb_roues());

        v2.setNb_roues(10);

        System.out.println(v2.getNb_roues());

    }
}
