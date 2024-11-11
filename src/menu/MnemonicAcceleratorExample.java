package menu;
import javax.swing.*;
import java.awt.event.*;

public class MnemonicAcceleratorExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mnemonic and Accelerator Example");

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        openItem.setMnemonic(KeyEvent.VK_O); // Alt + O

        fileMenu.add(openItem);

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}