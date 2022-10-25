package listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;
import java.util.Objects;

public class ItemListenerExample extends JFrame implements ItemListener {

    private final JLabel label;
    private final JComboBox<String> comboBox;

    public ItemListenerExample() {
        this.setLayout(new FlowLayout());

        label = new JLabel("Hello World!");

        String[] availableFonts = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames(Locale.CANADA);

        comboBox = new JComboBox<>(availableFonts);

        comboBox.addItemListener(this);

        this.add(label);
        this.add(comboBox);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String fontName = Objects.requireNonNull(comboBox.getSelectedItem()).toString();

        Font font = new Font(fontName, Font.BOLD, 12);

        label.setFont(font);
    }
}
