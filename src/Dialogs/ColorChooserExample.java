package Dialogs;
import javax.swing.*;
import java.awt.*;

public class ColorChooserExample {
    public static void main(String[] args) {
        Color color = JColorChooser.showDialog(null, "Choose a Color", Color.RED);
        if (color != null) {
            System.out.println("Selected color: " + color);
        }
    }
}