package simple;

import javax.swing.*;
import java.awt.*;

public class Execution {

    public static void main(String[] args) {

        JFrame frame = new JFrame("IFT1025");
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel label = new JLabel("Hello World! Hello IFT1025!");

        JPanel north = new JPanel(new FlowLayout());

        north.add(label);

        frame.add(north, BorderLayout.NORTH);
    }
}
