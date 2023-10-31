package gui;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
public class testlabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame window=new JFrame();
final int WINDOW_HEIGHT=250;
final int WINDOW_WIDTH=250;
window.setTitle("Simple window");
window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setVisible(true);
window.setLocationRelativeTo(null);
window.setExtendedState(JFrame.MAXIMIZED_BOTH);
window.setLayout(null);
window.setLocation(100,100);
window.setAlwaysOnTop(true);
ImageIcon img=new ImageIcon("Image/c.png");
window.setIconImage(img.getImage());
window.setResizable(true);
window.getContentPane().setBackground(Color.decode("#bdc3c7"));
window.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,150,150));

JLabel label=new JLabel();
label.setText("Welcome to B.SC 2H");
label.setFont(new Font("Goudy Old Style",Font.BOLD,66));
label.setBackground(Color.decode("#FF69B4"));
label.setForeground(Color.decode("#800080"));
label.setSize(1000,300);
label.setLocation(0,30);
window.getContentPane().add(label);

	}

}
