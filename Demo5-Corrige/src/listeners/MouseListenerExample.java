package listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends JFrame implements MouseListener {

    private final JTextArea textArea;

    public MouseListenerExample() {

        JLabel label = new JLabel("Press, release or click the mouse on the textArea to see (x, y), Coordinates");
        textArea = new JTextArea(20, 30);
        textArea.addMouseListener(this);

        JPanel north = new JPanel(new FlowLayout());
        JPanel center = new JPanel(new FlowLayout());

        north.add(label);
        center.add(textArea);

        this.add(north, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);

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
}
