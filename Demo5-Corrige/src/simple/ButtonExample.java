package simple;

import javax.swing.*;

public class ButtonExample extends JFrame {

    public ButtonExample() {
        JButton button = new JButton("click");
        button.setBounds(130, 100, 100, 40);

        this.add(button);
    }
}
