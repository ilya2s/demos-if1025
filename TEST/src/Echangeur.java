public class Echangeur {

    public int a,b;

    public Echangeur(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void echanger() {
        int temp = a;
        a = b;
        b = temp;
    }
}
