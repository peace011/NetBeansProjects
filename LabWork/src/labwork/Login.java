package labwork;
import javax.swing.*;
//import java.awt.*;

public class Login extends JFrame {
    private JTextField tf;
    private JFrame f;
    private JPasswordField tPassword;

    public Login() {
        f = new JFrame("Login");
        JLabel user = new JLabel("Username");
        user.setBounds(20, 20, 150, 20);
        f.add(user);

        tf = new JTextField();
        tf.setBounds(180, 20, 150, 25);
        f.add(tf);

        JLabel lPassword = new JLabel("Password");
        lPassword.setBounds(20, 55, 150, 25);
        f.add(lPassword);

        tPassword = new JPasswordField();
        tPassword.setBounds(180, 55, 150, 25);
        f.add(tPassword);

        JButton b = new JButton("Login");
        b.setBounds(180, 100, 100, 25);
        f.add(b);


        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
