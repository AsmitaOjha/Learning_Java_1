package menu;
import javax.swing.*;

public class ToolBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toolbar Example");

        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("New"));
        toolBar.add(new JButton("Open"));

        frame.getContentPane().add(toolBar, "North"); // Add toolbar at the top

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}