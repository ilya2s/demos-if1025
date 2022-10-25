package moi;

import javax.swing.*;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextHighlight extends JFrame {
    private final JTextArea textArea;
    private final JTextField textField;

    public TextHighlight() {
        textArea = new JTextArea("Ce système n'est pas vu par le public. Il est privé.", 10, 30);

        textArea.setLineWrap(true);
        textArea.setSize(textArea.getPreferredSize());
        textArea.setSelectionColor(Color.red);
        textArea.setSelectedTextColor(Color.BLUE);

        textField = new JTextField(30);

        enterEvents();

        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel center = new JPanel(new FlowLayout());
        JPanel south = new JPanel(new FlowLayout());

        center.add(scrollPane);
        south.add(textField);

        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);

        setTitle("Highlight");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void enterEvents() {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    highlight(textField.getText().strip());
                }
            }
        });
    }

    private void removeHighlights(JTextComponent textComponent) {
        Highlighter highlighter = textComponent.getHighlighter();

        Highlighter.Highlight[] highlights = highlighter.getHighlights();

        for (Highlighter.Highlight highlight : highlights) {
            if (highlight.getPainter() != null) {
                highlighter.removeHighlight(highlight);
            }
        }
    }

    public void highlight(String pattern) {
        removeHighlights(textArea);

        try {
            Highlighter highlighter = textArea.getHighlighter();
            Document document = textArea.getDocument();
            String text = document.getText(0, document.getLength());

            int position = 0;

            while ((position = text.indexOf(pattern, position)) >= 0) {
                highlighter.addHighlight(
                        position,
                        (position + pattern.length()),
                        new DefaultHighlighter.DefaultHighlightPainter(Color.red));

                position += pattern.length();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
