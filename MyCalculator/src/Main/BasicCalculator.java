package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class BasicCalculator {

    double num, ans;
    int calculation;

    public void Calc() {
        switch (calculation) {
            case 1:
                ans = num + Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText(Double.toString(ans));
                break;

            case 2:
                ans = num - Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText(Double.toString(ans));
                break;

            case 3:
                ans = num * Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText(Double.toString(ans));
                break;

            case 4:
                ans = num / Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText(Double.toString(ans));
                break;


        }
    }

    private JButton a1Button; // 1
    private JPanel panel1; // panel
    private JButton a2Button; // 2
    private JButton a3Button; // 3
    private JButton a4Button; // 4
    private JButton a5Button; // 5
    private JButton a6Button; // 6
    private JButton a7Button; // 7
    private JButton a8Button; // 8
    private JButton a9Button; // 9
    private JButton a0Button; // 0
    private JButton button1; // +/-
    private JButton button2; // .
    private JButton CEButton; // CE
    private JButton button3; // +
    private JButton button4; // -
    private JButton button5; // *
    private JButton button6; // /
    private JButton button7; // =
    private JTextField CalcDisplay; // Display field

    public BasicCalculator() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ans = -1 * Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText(Double.toString(ans));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText(CalcDisplay.getText() + ".");
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalcDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText("");
                calculation = 1;
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText("");
                calculation = 2;
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText("");
                calculation = 3;
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(CalcDisplay.getText());
                CalcDisplay.setText("");
                calculation = 4;
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Calculator");
        frame.setContentPane(new BasicCalculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}