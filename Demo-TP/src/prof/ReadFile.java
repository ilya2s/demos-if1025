package prof;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReadFile extends JFrame implements ActionListener {
    private JFileChooser fc;
    private ArrayList<String> texte;
    private JTextArea ta;
    private JButton chooser;
    private JButton afficher;
    private JButton ecrire;

    public ReadFile() {
        JPanel haut = new JPanel();
        JPanel bas = new JPanel();
        this.add(haut, "North");
        this.add(bas, "Center");
        this.ta = new JTextArea("textarea", 10, 20);
        bas.add(this.ta);
        this.chooser = new JButton("choisir");
        haut.add(this.chooser);
        this.afficher = new JButton("afficher");
        haut.add(this.afficher);
        this.ecrire = new JButton("ecrire");
        haut.add(ecrire);
        this.fc = new JFileChooser();
        this.texte = new ArrayList();
        this.chooser.addActionListener(this);
        this.afficher.addActionListener(this);
        this.ecrire.addActionListener(this);
    }

    public void chargerFichier() {
        int val = this.fc.showOpenDialog(this);

        try {
            if (val == 0) {
                BufferedReader r = new BufferedReader(new FileReader(this.fc.getSelectedFile()));
                String line = null;

                while((line = r.readLine()) != null) {
                    this.texte.add(line);
                }

                r.close();
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public void ecrireFichier() {
        int val = this.fc.showSaveDialog(this);

        try {
            if (val == 0) {
                BufferedWriter r = new BufferedWriter(new FileWriter(this.fc.getSelectedFile()));
                if (texte != null) for (String s: texte) r.write(s+ "\n");
                r.close();
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }


    public void afficher() {
        if (this.texte != null) {
            Iterator var1 = this.texte.iterator();

            while(var1.hasNext()) {
                String s = (String)var1.next();
                this.ta.append(s + "\n");
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.chooser) {
            this.chargerFichier();
        }

        if (e.getSource() == this.afficher) {
            this.afficher();
        }

        if (e.getSource() == this.ecrire) {
            this.ecrireFichier();
        }
    }

    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        rf.setDefaultCloseOperation(3);
        rf.setSize(600, 400);
        rf.setVisible(true);
    }
}
