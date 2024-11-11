package menu;
import javax.swing.*;

public class CheckBox_RadioButton_Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Check Box and Radio Button Example");
        JMenuBar menuBar = new JMenuBar();

        JMenu optionsMenu = new JMenu("Options");

        JCheckBoxMenuItem checkBoxItem = new JCheckBoxMenuItem("Enable Feature");
        JRadioButtonMenuItem radioButton1 = new JRadioButtonMenuItem("Option 1");
        JRadioButtonMenuItem radioButton2 = new JRadioButtonMenuItem("Option 2");

        ButtonGroup group = new ButtonGroup(); // Group radio buttons
        group.add(radioButton1);
        group.add(radioButton2);

        optionsMenu.add(checkBoxItem);
        optionsMenu.add(radioButton1);
        optionsMenu.add(radioButton2);

        menuBar.add(optionsMenu);
        frame.setJMenuBar(menuBar);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}