package labwork;
import javax.swing.*;
import java.awt.*;

public class LabelWithFormatting {

    public static void main(String[] args) {

           JFrame frame = new JFrame("Label with Formatting");
           frame.setLayout(new GridLayout(1, 1)); // Using GridLayout with 1 row and 1 column

           // Create a label with formatted text
           JLabel label = new JLabel("<html><i><font color='red' size='5'>Hello, My name is Puja Gurung</font></i></html>");
            
           frame.setSize(600, 600);
           frame.add(label);
           frame.pack();
           frame.setLocationRelativeTo(null); // Center the frame on the screen
           frame.setVisible(true);
    }
}
