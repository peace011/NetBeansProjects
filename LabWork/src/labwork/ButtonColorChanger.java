package labwork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColorChanger implements ActionListener {
    private JButton button;
    JFrame f;

    public ButtonColorChanger() {
        f= new JFrame("Button Color Changer");
        f.setSize(300, 200);
        
        // Create the button
        button = new JButton("Click Me");
        button.addActionListener(this);
        
        f.add(button);
        f.setVisible(true);  
    }
    // ActionListener for the button
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean isColorChanged = button.getBackground() == Color.RED;

        if (isColorChanged) {
            button.setBackground(null); // Reset to the default color
        } else {
            button.setBackground(Color.RED); // Change the background color to red
        }
    }

    public static void main(String[] args) { 
        
            ButtonColorChanger buttonColorChanger = new ButtonColorChanger();
    }
}



