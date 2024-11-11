package menu;
import javax.swing.*;

public class EnableDisableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Enable/Disable Menu Item Example");

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");

        // Initially disable the Open item
        openItem.setEnabled(false);

        fileMenu.add(openItem);

        menuBar.add(fileMenu);

        JButton toggleButton = new JButton("Toggle Open Item");

        toggleButton.addActionListener(e -> openItem.setEnabled(!openItem.isEnabled()));

        frame.getContentPane().add(toggleButton, "South"); // Add button at the bottom

        frame.setJMenuBar(menuBar);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}