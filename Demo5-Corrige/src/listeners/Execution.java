package listeners;

import listeners.ItemListenerExample;
import listeners.MouseListenerExample;

import javax.swing.*;

public class Execution {

    public static void main(String[] args) {
        MouseListenerExample frameMouse = new MouseListenerExample();
        frameMouse.setTitle("Mouse Listener Example");
        frameMouse.pack();
        frameMouse.setLocationRelativeTo(null);
        frameMouse.setVisible(true);
        frameMouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ItemListenerExample frameItem = new ItemListenerExample();
        frameItem.setTitle("Item Listener Example");
        frameItem.pack();
        frameItem.setLocationRelativeTo(null);
        frameItem.setVisible(true);

    }
}
