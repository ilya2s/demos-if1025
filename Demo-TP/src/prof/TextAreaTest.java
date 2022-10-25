package prof;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class TextAreaTest extends JFrame
{
    JTextArea textArea;
    JScrollPane scrollPane;

    public TextAreaTest()
    {
        textArea = new JTextArea( "one two\nthree four", 10, 30 )
            {
                //  the tab character is not inserted into the text area
                public boolean isManagingFocus()
                {
                    return false;
                }
            };
        textArea.setLineWrap( true );
        textArea.setSize( textArea.getPreferredSize() );
        textArea.setSelectionColor( Color.red );
        textArea.setSelectedTextColor( Color.green );

        scrollPane = new JScrollPane( textArea );
        getContentPane().add( scrollPane );
        JTextField field = new JTextField(10);
        getContentPane().add(field, BorderLayout.SOUTH);

        textArea.addMouseListener( new MouseAdapter()
            {
                public void mouseClicked(MouseEvent e)
                {
                    if ( SwingUtilities.isRightMouseButton(e) )
                        {
                            try
                                {
                                    // Donne la position du clique dans le texte à partir du clic dans le textArea (View)
                                    int offset = textArea.viewToModel2D(e.getPoint());
                                    System.out.println("Offest : " + offset);

                                    // Donne la positon (x,y) du clique dans le textArea (View) à partir de sa position
                                    // dans le texte
                                    System.out.println("ModelToView :" + textArea.modelToView2D(offset));

                                    // Donne la position de départ dans le texte du mot cliqué
                                    int start = Utilities.getWordStart(textArea, offset);
                                    System.out.println("Start : " + start);

                                    // Donne la postion de fin dans le texte du mot cliqué
                                    int end = Utilities.getWordEnd(textArea, offset);
                                    System.out.println("End : " + end);

                                    // getText() de la position de début et de longueur (fin - début)
                                    String word = textArea.getDocument().getText(start, end-start);
                                    System.out.println("Selected word: " + word );

                                    // Donne la position de début de la rangée dans le texte
                                    int rowStart = Utilities.getRowStart(textArea, offset);
                                    System.out.println("Row start offset: " + rowStart );

                                    // Dans la position de fin de la rangée dans le texte
                                    int rowEnd = Utilities.getRowEnd(textArea, offset);
                                    System.out.println("Row end offset: " + rowEnd );

                                    // Permet de highlight une zone de texte
                                    textArea.select(start, end);
                                }
                            catch (Exception e2) {}
                        }
                }
            });

        textArea.addCaretListener( new CaretListener()
            {
                public void caretUpdate(CaretEvent e)
                {

                    // Donne la position du caret ou la position de debut et de fin de la selection
                    int caretPosition = textArea.getCaretPosition();
                    System.out.println("Position du Caret dans le texte : " + caretPosition);


                    Element root = textArea.getDocument().getDefaultRootElement();
                    System.out.println("Root : " + root);

                    // Donne l'ndex de la rangée où se trouve le caret
                    int row = root.getElementIndex(caretPosition);
                    System.out.println("Row : " + row);

                    // Donne l'index de la colonne où se trouve le caret
                    // (Position du caret) -  offset of row
                    int column = caretPosition - root.getElement(row).getStartOffset();
                    System.out.println("Column : " + column);
                }
            });


        textArea.addKeyListener( new KeyAdapter()
            {
                public void keyPressed(KeyEvent e)
                {
                    int numberOfElements = textArea.getDocument().getDefaultRootElement().getElementCount();
                    System.out.println("Nombre d'elements dans le texte : " + numberOfElements);
                    field.setText(String.valueOf(numberOfElements));
                }
            });

        //textArea.getInputMap().put( KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "" );
    }

    public static void main(String[] args)
    {
        TextAreaTest frame = new TextAreaTest();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    }
}