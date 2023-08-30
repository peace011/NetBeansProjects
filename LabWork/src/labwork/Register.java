package labwork;
import javax.swing.*;

public class Register extends JFrame {
    private JTextField tf;
    private JFrame f;
    private JPasswordField tPassword;

    public Register() {
        f = new JFrame("Register");
        JLabel user = new JLabel("Firstname");
        user.setBounds(20, 20, 150, 20);
        f.add(user);

        tf = new JTextField();
        tf.setBounds(180, 20, 150, 25);
        f.add(tf);

        JLabel lPassword = new JLabel("Lastname");
        lPassword.setBounds(20, 55, 150, 25);
        f.add(lPassword);

        tPassword = new JPasswordField();
        tPassword.setBounds(180, 55, 150, 25);
        f.add(tPassword);

        JButton b = new JButton("Register");
        b.setBounds(180, 100, 100, 25);
        f.add(b);

        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Register();
    }
}
