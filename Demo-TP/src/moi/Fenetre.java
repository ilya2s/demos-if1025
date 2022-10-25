package moi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Fenetre extends JFrame implements ActionListener {
    private final JButton fichier;
    private final JMenuItem save;
    private final JMenuItem open;
    private final JPopupMenu menu;
    private final JTextArea textArea;
    private final JFileChooser fileChooser;

    public Fenetre() {
        fichier = new JButton("Fichier");
        fichier.addActionListener(this);

        save = new JMenuItem("Save");
        save.addActionListener(this);

        menu = new JPopupMenu("Menu");

        open = new JMenuItem("Open");
        open.addActionListener(this);

        menu.add(save);
        menu.add(open);

        textArea = new JTextArea(50, 100);
        textArea.setLineWrap(true);
        textArea.setSize(textArea.getPreferredSize());

        fileChooser = new JFileChooser();

        JPanel north = new JPanel(new FlowLayout());
        JPanel center = new JPanel(new FlowLayout());

        north.add(fichier);
        center.add(textArea);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        setTitle("moi.Fenetre avec fichiers");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void afficherMenu() {
        menu.show(fichier, 0, fichier.getHeight());
    }

    public void openFile() {
        int status = fileChooser.showOpenDialog(this);

        if (status == 0) {
            textArea.setText(null);

            try (BufferedReader br = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void saveFile() {
        int status = fileChooser.showSaveDialog(this);

        if (status == 0) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                if (textArea.getText() != null) {
                    bw.write(textArea.getText());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fichier) {
            afficherMenu();
        }
        if (e.getSource() == open) {
            openFile();
        }
        if (e.getSource() == save) {
            saveFile();
        }
    }
}
