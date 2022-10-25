package fenetre;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

public class Fenetre extends JFrame {

    public Fenetre() {
        JLabel label = new JLabel("Voici un label qui dit Hello World !");
        JTextArea textArea = new JTextArea(20, 30);

        String[] list = {"Hello", "test", "wow"};
        JComboBox<String> comboBox = new JComboBox<>(list);

        JCheckBox checkBox = new JCheckBox("Veuillez selectionner");

        JPanel north = new JPanel(new FlowLayout());
        JPanel center = new JPanel(new FlowLayout());
        JPanel south = new JPanel(new FlowLayout());

        north.add(label);
        center.add(textArea);
        south.add(comboBox);
        south.add(checkBox);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
    }
}
