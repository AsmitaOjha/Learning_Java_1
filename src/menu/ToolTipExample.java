package menu;
import javax.swing.*;

public class ToolTipExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tooltip Example");

        JButton button = new JButton("Hover over me!");
        button.setToolTipText("This button does something!");

        frame.getContentPane().add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}