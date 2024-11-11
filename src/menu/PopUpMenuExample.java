package menu;
import javax.swing.*;

public class PopUpMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pop-up Menu Example");

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Cut"));
        popupMenu.add(new JMenuItem("Copy"));

        JLabel label = new JLabel("Right-click here for options.");

        label.setComponentPopupMenu(popupMenu); // Attach pop-up to label

        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}