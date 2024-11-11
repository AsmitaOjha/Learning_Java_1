package menu;
import javax.swing.*;

public class Icons_In_Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Icon Example");
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        ImageIcon icon = new ImageIcon("/E://Logo and symbols//small logo of my.png/"); // Specify the path to your icon
        JMenuItem openItem = new JMenuItem("Open", icon);
        fileMenu.add(openItem);

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);


        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}