import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test {
    private JButton button1;
    private JPanel panel1;

    public Test() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello, World");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new Test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

