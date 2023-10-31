package assignment45;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q48 extends JFrame {
    private JTextField num1TextField, num2TextField, gcdTextField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q48().setVisible(true));
    }

    public Q48() {
        setTitle("GCD Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel num1Label = new JLabel("num1:");
        num1TextField = new JTextField(10);

        JLabel num2Label = new JLabel("num2:");
        num2TextField = new JTextField(10);

        JButton gcdButton = new JButton("GCD");
        gcdTextField = new JTextField(10);
        gcdTextField.setEditable(false);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1TextField.setText("");
                num2TextField.setText("");
                gcdTextField.setText("");
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(num1Label);
        inputPanel.add(num1TextField);
        inputPanel.add(num2Label);
        inputPanel.add(num2TextField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(gcdButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(gcdTextField, BorderLayout.SOUTH);

        gcdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateGCD();
            }
        });
    }

    private void calculateGCD() {
        try {
            int num1 = Integer.parseInt(num1TextField.getText());
            int num2 = Integer.parseInt(num2TextField.getText());
            int gcd = findGCD(num1, num2);
            gcdTextField.setText(String.valueOf(gcd));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter integers.");
        }
    }

    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}

