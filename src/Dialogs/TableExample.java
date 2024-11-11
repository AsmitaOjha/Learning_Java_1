package Dialogs;
import javax.swing.*;
import java.awt.*;

public class TableExample {
    public static void main(String[] args) {
        String[] columnNames = {"Name", "Age"};
        Object[][] data = {{"Alice", 30}, {"Bob", 25}};

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table); // Add scroll pane for large tables

        JFrame frame = new JFrame("Table Example");
        frame.add(scrollPane);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}