package simple;

import javax.swing.*;

public class RadioButton extends JFrame {

    public RadioButton() {
        JRadioButton radioButton = new JRadioButton("Select this answer");
        radioButton.setBounds(130, 200, 200, 40);

        add(radioButton);
    }
}
