package fenetre;

import javax.swing.*;

public class Execution {

    public static void main(String[] args) {
        Fenetre f = new Fenetre();
        f.setTitle("HELLO IFT1025!");
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
