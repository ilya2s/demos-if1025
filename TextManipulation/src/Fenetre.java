import javax.swing.*;
import javax.swing.event.CaretListener;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame {
    private final JTextArea textArea;
    private final JTextField textField;

    public Fenetre() {
        textArea = new JTextArea("one two\nthree four", 10, 30);

        textArea.setLineWrap(true);
        textArea.setSize(textArea.getPreferredSize());
        textArea.setSelectionColor(Color.red);
        textArea.setSelectedTextColor(Color.BLUE);

        textField = new JTextField(30);

        mouseEvents();
        caretEvents();
        keyEvents();

        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel center = new JPanel(new FlowLayout());
        JPanel south = new JPanel(new FlowLayout());

        center.add(scrollPane);
        south.add(textField);

        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);

        setTitle("Manipulation de texte");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mouseEvents() {
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    // Donne la position du clique dans le texte à partir du clic dans le textArea (View)
                    int offset = textArea.viewToModel2D(e.getPoint());
                    System.out.println("Offset : " + offset);

                    // Donne la positon (x,y) du clique dans le textArea (View) à partir de sa position
                    // dans le texte
                    System.out.println("position (x, y) : " + textArea.modelToView2D(offset));

                    // Donne la position de départ dans le texte du mot cliqué
                    int start = Utilities.getWordStart(textArea, offset);
                    System.out.println("Clicked word start : " + start);

                    // Donne la postion de fin dans le texte du mot cliqué
                    int end = Utilities.getWordEnd(textArea, offset);
                    System.out.println("Clicked word end : " + end);

                    // getText() de la position de début et de longueur (fin - début)
                    String word = textArea.getText(start, end - start);
                    System.out.println("Selected word : " + word);

                    // Donne la position de début de la rangée dans le texte
                    int rowStart = Utilities.getRowStart(textArea, offset);
                    System.out.println("Clicked Row Start : " + rowStart);

                    // Donne la position de fin de la rangée dans le texte
                    int rowEnd = Utilities.getRowEnd(textArea, offset);
                    System.out.println("Clicked Row End : " + rowEnd);

                    // Permet de highlight une zone de texte si click droit
                    if (SwingUtilities.isRightMouseButton(e)) {
                        textArea.select(start, end);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private void caretEvents() {
        textArea.addCaretListener(e -> {
            // Donne la postion du caret OU la position de début et de fin de la sélection
            int caretPosition = textArea.getCaretPosition();
            System.out.println("Caret position : " + caretPosition);

            Element root = textArea.getDocument().getDefaultRootElement();

            // Donne la ligne du mot cliqué
            int row = root.getElementIndex(caretPosition);
            System.out.println("The clicked word is at row : " + row);

            // Donne la colonne du mot cliqué
            int column = caretPosition - root.getElement(row).getStartOffset();
            System.out.println("The clicked word is at column : " + column);
        });
    }

    private void keyEvents() {
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                int numberOfLines = textArea.getDocument().getDefaultRootElement().getElementCount();
                System.out.println("Number of lines in the text : " + numberOfLines);

                textField.setText(String.valueOf(numberOfLines));
            }
        });
    }
}
