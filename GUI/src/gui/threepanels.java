package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class threepanels
{


	JFrame frame;
	private JTextField PID1;
	private JTextField QTY1;
	private JTextField PRICE1;
	private JTextField TOTAL1;
	private JTextField PID2;
	private JTextField QTY2;
	private JTextField PRICE2;
	private JTextField TOTAL2;
	private JTextArea REPORT;

	/**
	 * Launch the application.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.setBounds(100, 100, 1026, 586);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("XYZ COMPANY");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 28));
		lblNewLabel.setBounds(351, 10, 233, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel product_1 = new JPanel();
		product_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		product_1.setBackground(new Color(192, 192, 192));
		product_1.setBounds(10, 83, 299, 375);
		frame.getContentPane().add(product_1);
		product_1.setLayout(null);
		
		JLabel lblPid = new JLabel("PID");
		lblPid.setBounds(36, 86, 49, 24);
		lblPid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		product_1.add(lblPid);
		
		JLabel lblNewLabel_1 = new JLabel("Product 1");
		lblNewLabel_1.setBounds(98, 10, 102, 30);
		product_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JLabel lblNewLabel_4 = new JLabel("QTY");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(36, 131, 49, 30);
		product_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PRICE");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(36, 180, 62, 24);
		product_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TOTAL");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(36, 280, 89, 39);
		product_1.add(lblNewLabel_6);
		
		PID1 = new JTextField();
		PID1.setBounds(104, 86, 129, 30);
		product_1.add(PID1);
		PID1.setColumns(10);
		
		QTY1 = new JTextField();
		QTY1.setColumns(10);
		QTY1.setBounds(104, 134, 129, 30);
		product_1.add(QTY1);
		
		PRICE1 = new JTextField();
		PRICE1.setColumns(10);
		PRICE1.setBounds(104, 174, 129, 30);
		product_1.add(PRICE1);
		
		TOTAL1 = new JTextField();
		TOTAL1.setColumns(10);
		TOTAL1.setBounds(121, 280, 129, 30);
		product_1.add(TOTAL1);
		
		JButton CALC1 = new JButton("CALCULATE");
		CALC1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int n=Integer.parseInt(QTY1.getText());
				int p=Integer.parseInt(PRICE1.getText());
				int z= n*p;
				TOTAL1.setText("RS. "+z);
			}
		});
		CALC1.setForeground(new Color(0, 0, 0));
		CALC1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		CALC1.setBackground(new Color(138, 43, 226));
		CALC1.setBounds(48, 226, 185, 44);
		product_1.add(CALC1);
		
		JPanel product_2 = new JPanel();
		product_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		product_2.setBackground(Color.LIGHT_GRAY);
		product_2.setBounds(351, 83, 312, 375);
		frame.getContentPane().add(product_2);
		product_2.setLayout(null);
		
		JLabel lblPid_1 = new JLabel("PID");
		lblPid_1.setBounds(48, 86, 56, 24);
		lblPid_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		product_2.add(lblPid_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product 2");
		lblNewLabel_2.setBounds(121, 8, 102, 30);
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		product_2.add(lblNewLabel_2);
		
		JLabel label = new JLabel("QTY");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(48, 131, 56, 30);
		product_2.add(label);
		
		JLabel label_1 = new JLabel("PRICE");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(48, 183, 62, 24);
		product_2.add(label_1);
		
		JLabel label_2 = new JLabel("TOTAL");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(48, 280, 89, 39);
		product_2.add(label_2);
		
		PID2 = new JTextField();
		PID2.setColumns(10);
		PID2.setBounds(118, 86, 129, 30);
		product_2.add(PID2);
		
		QTY2 = new JTextField();
		QTY2.setColumns(10);
		QTY2.setBounds(118, 134, 129, 30);
		product_2.add(QTY2);
		
		PRICE2 = new JTextField();
		PRICE2.setColumns(10);
		PRICE2.setBounds(118, 183, 129, 30);
		product_2.add(PRICE2);
		
		TOTAL2 = new JTextField();
		TOTAL2.setColumns(10);
		TOTAL2.setBounds(141, 280, 129, 30);
		product_2.add(TOTAL2);
		
		JButton CALC2 = new JButton("CALCULATE");
		CALC2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int o=Integer.parseInt(QTY2.getText());
				int q=Integer.parseInt(PRICE2.getText());
				int y=o*q;
				TOTAL2.setText("RS. "+y);
			}
		});
		CALC2.setForeground(Color.BLACK);
		CALC2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		CALC2.setBackground(new Color(128, 0, 128));
		CALC2.setBounds(58, 223, 185, 44);
		product_2.add(CALC2);

		
		JPanel report = new JPanel();
		report.setBackground(SystemColor.controlHighlight);
		report.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		report.setBounds(695, 177, 307, 281);
		frame.getContentPane().add(report);
		report.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("REPORT");
		lblNewLabel_3.setBounds(102, 8, 103, 30);
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		report.add(lblNewLabel_3);
		
		REPORT = new JTextArea();
		REPORT.setBackground(new Color(175, 238, 238));
		REPORT.setColumns(10);
		REPORT.setBounds(34, 48, 246, 210);
		report.add(REPORT);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				int n=Integer.parseInt(QTY1.getText());
				int o=Integer.parseInt(QTY2.getText());
				int p=Integer.parseInt(PRICE1.getText());
				int q=Integer.parseInt(PRICE2.getText());
				int z= n*p;
				int y=o*q;
				int x=z+y;
				String data="PID1 : " +PID1.getText()+ "\n";
				String data1="PID2 : " +PID2.getText()+ "\n";
				String data2="QTY1 * PRICE1 : " +QTY1.getText()+ "*" +PRICE1.getText()+ "= " +z+"\n";
				String data3="QTY2 * PRICE2 : " +QTY2.getText()+"* " +PRICE2.getText()+ "= " +y+ "\n";
				String data4="Total amount to be paid Rs. " +x;
				REPORT.setText(data+data1+data2+data3+data4);
				REPORT.setEditable(false);		}
		});
		btnShow.setForeground(Color.BLACK);
		btnShow.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnShow.setBackground(new Color(255, 69, 0));
		btnShow.setBounds(729, 83, 244, 84);
		frame.getContentPane().add(btnShow);
	
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					threepanels window = new threepanels();
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
	public threepanels() {
		initialize();
	}
}
	/**
	 * Initialize the contents of the frame.
	 */
	
