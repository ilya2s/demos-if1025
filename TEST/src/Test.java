public class Test {

    public static void main(String[] args) {
        Conduire cond;
        Vehicule ve;
        Camion cam = new Camion();
        cond = (Conduire) cam;
        ve = new Bus();
    }
}
