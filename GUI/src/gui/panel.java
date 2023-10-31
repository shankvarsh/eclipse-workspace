package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class panel {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 505, 330);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		final JPanel greypanel = new JPanel();
		greypanel.setBackground(Color.LIGHT_GRAY);
		greypanel.setBounds(10, 80, 471, 203);
		frame.getContentPane().add(greypanel);
		greypanel.setVisible(false);
		
		final JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setForeground(Color.WHITE);
		bluepanel.setBounds(10, 80, 471, 203);
		frame.getContentPane().add(bluepanel);
		bluepanel.setVisible(false);
		
		JButton btnNewButton = new JButton("Grey");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				greypanel.setVisible(true);
				bluepanel.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(10, 10, 125, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Blue");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bluepanel.setVisible(true);
				greypanel.setVisible(false);
				
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(141, 10, 125, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel = new JLabel("This is grey panel");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		greypanel.add(lblNewLabel);
		
	
		JLabel lblNewLabel1 = new JLabel("This is blue panel");
		lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel1.setForeground(Color.WHITE);
		bluepanel.add(lblNewLabel1);
	}
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel window = new panel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public panel() {
		initialize();
	}
}
