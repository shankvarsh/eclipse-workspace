package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tableSample {

	private JFrame frame;
	private JTextField textFieldrollno;
	private JTextField textFieldname;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableSample window = new tableSample();
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
	public tableSample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblrollno = new JLabel("Roll no.");
		lblrollno.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblrollno.setBounds(10, 10, 84, 35);
		frame.getContentPane().add(lblrollno);
		
		textFieldrollno = new JTextField();
		textFieldrollno.setBounds(88, 10, 131, 29);
		frame.getContentPane().add(textFieldrollno);
		textFieldrollno.setColumns(10);
		
		textFieldname = new JTextField();
		textFieldname.setColumns(10);
		textFieldname.setBounds(354, 10, 131, 29);
		frame.getContentPane().add(textFieldname);
		
		JLabel labelname = new JLabel("Name");
		labelname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelname.setBounds(245, 10, 84, 35);
		frame.getContentPane().add(labelname);
		
		JButton btninsert = new JButton("Insert");
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel md1 = (DefaultTableModel)table.getModel();
				md1.addRow(new Object[] {textFieldrollno.getText(),textFieldname.getText()});
				
				
				
			}
		});
		btninsert.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btninsert.setBounds(218, 44, 122, 35);
		frame.getContentPane().add(btninsert);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 104, 503, 214);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.PINK);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Roll no.", "Name"
			}
		));
		scrollPane.setViewportView(table);
	}
}
