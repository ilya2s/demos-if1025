package fenetre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;
import java.util.Objects;

public class Fenetre extends JFrame implements MouseListener, ItemListener {

    private final JTextArea textArea;
    private final JLabel label;

    private final JComboBox<String> comboBox;

    public Fenetre() {
        label = new JLabel("Hello World! Hello IFT1025!");

        textArea = new JTextArea(20, 30);
        textArea.addMouseListener(this);


        String[] availableFonts = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames(Locale.CANADA);

        comboBox = new JComboBox<>(availableFonts);
        comboBox.addItemListener(this);

        JPanel north = new JPanel(new FlowLayout());
        JPanel center = new JPanel(new FlowLayout());
        JPanel south = new JPanel(new FlowLayout());

        north.add(label);
        center.add(textArea);
        south.add(comboBox);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);


        setTitle("TITLE IN CLASSE");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String s = String.format("Mouse Clicked: (x, y) = (%d, %d)", e.getX(), e.getY());

        textArea.setText(s);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String s = String.format("Mouse Pressed: (x, y) = (%d, %d)", e.getX(), e.getY());

        textArea.setText(s);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String s = String.format("Mouse Released: (x, y) = (%d, %d)", e.getX(), e.getY());

        textArea.setText(s);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String s = "Mouse Entered";

        textArea.setText(s);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String s = "Mouse Exited";

        textArea.setText(s);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String fontName = Objects.requireNonNull(comboBox.getSelectedItem()).toString();

        Font font = new Font(fontName, Font.BOLD, 12);

        label.setFont(font);
    }
}
