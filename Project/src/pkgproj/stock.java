package pkgproj;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class stock {

	JFrame frame;
	private JTable table_1;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stock window = new stock();
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
	public stock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 1054, 463);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon img=new ImageIcon("images/logo.png");
		frame.setIconImage(img.getImage());
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 156, 1012, 228);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"S1O2N3Y", "SONY", "SONY Z6+", "10", "RS.1,50,000"},
				{"S0O7N42", "SONY", "SONY Z6 ", "5", "RS.1,18,000"},
				{"S9ON12Y", "SONY", "SONY ALPHA ZX10", "18", "RS.49,000"},
				{"SO789NY", "SONY", "SONY MIRRORLESS A5", "2", "RS.68,000"},
				{"SO9N77Y", "SONY", "SONY ALPHA TX10", "16", "RS.90,000"},
				{"S80ON3Y", "SONY", "SONY MIRROR 4", "1", "RS.3,50,555"},
				{"S1O1N1Y", "SONY", "SONY MIRRORLESS A18", "2", "RS.67,000"},
				{"S9ON86Y", "SONY", "SONY ALPHA 12", "12", "RS. 72,999"},
				{"S0ON08Y", "SONY", "SONY K9", "23", "RS. 80,000"},
				{"S13ON1Y", "SONY", "SONY HAND HELD 66", "7", "RS. 45,000"},
				{"S1ON31Y", "SONY", "SONY 55", "9", "RS. 98,000"},
				{"S9ON57Y", "SONY", "SONY MIRRORLESS 99", "5", "RS. 67,000"},
				{"N123", "NIKON", "NIKOND7200", "10", "RS. 45,000"},
				{"N234", "NIKON", "NIKOND5200", "1", "RS. 55,000"},
				{"N345", "NIKON", "NIKOND7500", "67", "RS. 67,000"},
				{"N456", "NIKON", "NIKOND5300", "23", "RS. 52,000"},
				{"N567", "NIKON", "NIKONK55", "9", "RS. 43,000"},
				{"N678", "NIKON", "NIKONZF", "80", "RS. 99,000"},
				{"N789", "NIKON", "NIKONZ20", "1", "RS. 11,000"},
				{"N890", "NIKON", "NIKONZ10", "67", "RS. 50,000"},
				{"N901", "NIKON", "NIKONR9", "34", "RS. 43,000"},
				{"N012", "NIKON", "NIKONH8", "9", "RS. 10,000"},
				{"CAN11", "CANON", "CANON REBEL", "35", "RS. 23,000"},
				{"CAN78", "CANON", "CANON1300D", "23", "RS. 45,000"},
				{"CAN67", "CANON", "CANON720D", "12", "RS. 35000"},
			},
			new String[] {
				"PRODUCT ID", "PRODUCT MODEL", "PRODUCT NAME", "QTY", "COST PER PRODUCT"
			}
		));
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setMinWidth(60);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(110);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(138);
		table_1.getColumnModel().getColumn(2).setMinWidth(27);
		table_1.getColumnModel().getColumn(4).setResizable(false);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(120);
		table_1.setBackground(new Color(230, 230, 250));
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Stock Database");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(421, 10, 232, 57);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Sylfaen", Font.ITALIC, 23));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel table = (DefaultTableModel)table_1.getModel();
				String search = textField.getText().toUpperCase();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
				table_1.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
 			}
		});
		textField.setBounds(382, 96, 278, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("SEARCH");
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.ITALIC, 30));
		lblNewLabel_1.setBounds(256, 96, 129, 50);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
