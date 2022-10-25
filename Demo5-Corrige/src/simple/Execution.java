package simple;

import javax.swing.*;

public class Execution {

    public static void main(String[] args) {

        ButtonExample button = new ButtonExample();
        button.setSize(400, 500);

        RadioButton radioButton = new RadioButton();
        radioButton.setSize(400, 500);


        button.setLayout(null);
        button.setLocationRelativeTo(null);
        button.setVisible(true);
        button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        radioButton.setLayout(null);
        radioButton.setLocationRelativeTo(null);
        radioButton.setVisible(true);





    }
}
