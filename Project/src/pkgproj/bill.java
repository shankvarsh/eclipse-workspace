package pkgproj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	JFrame frame;
	private JTextField txtname;
	private JTextField txtphn;
	private JTextField textField_2;
	private JTextField txttotal;
	private ButtonGroup gengp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 153));
		frame.setBounds(100, 100, 1025, 715);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon img=new ImageIcon("images/logo.png");
		frame.setIconImage(img.getImage());
		
		JLabel bill = new JLabel("Bill");
		bill.setHorizontalAlignment(SwingConstants.CENTER);
		bill.setFont(new Font("Sitka Subheading", Font.ITALIC, 70));
		bill.setBounds(404, 10, 141, 88);
		frame.getContentPane().add(bill);
		
		JLabel name = new JLabel("Name :");
		name.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		name.setBounds(21, 118, 117, 52);
		frame.getContentPane().add(name);
		
		JLabel phn = new JLabel("Phone Number :");
		phn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		phn.setBounds(21, 167, 196, 52);
		frame.getContentPane().add(phn);
		
		JLabel add = new JLabel("Address :");
		add.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		add.setBounds(21, 214, 149, 52);
		frame.getContentPane().add(add);
		
		JLabel brand = new JLabel("Brand :");
		brand.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		brand.setBounds(21, 351, 102, 35);
		frame.getContentPane().add(brand);
		
		final JCheckBox sony = new JCheckBox("Sony");
		sony.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		sony.setBounds(107, 354, 74, 32);
		frame.getContentPane().add(sony);
		
		final JCheckBox nikon = new JCheckBox("Nikon");
		nikon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		nikon.setBounds(209, 354, 92, 32);
		frame.getContentPane().add(nikon);
		
		final JCheckBox canon = new JCheckBox("Canon");
		canon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		canon.setBounds(316, 354, 92, 32);
		frame.getContentPane().add(canon);
		
		JLabel total = new JLabel("Total Amount :");
		total.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		total.setBounds(21, 514, 160, 42);
		frame.getContentPane().add(total);
		
		JLabel pm = new JLabel("Payment mode : ");
		pm.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		pm.setBounds(21, 396, 173, 60);
		frame.getContentPane().add(pm);
		
		JLabel membership = new JLabel("Membership :");
		membership.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		membership.setBounds(21, 466, 149, 38);
		frame.getContentPane().add(membership);
		
		final JRadioButton yes = new JRadioButton("Yes");
		yes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		yes.setBounds(189, 477, 61, 27);
		frame.getContentPane().add(yes);
		
		final JRadioButton no = new JRadioButton("No");
		no.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		no.setBounds(268, 477, 61, 27);
		frame.getContentPane().add(no);
		
		gengp = new ButtonGroup(); 
		gengp.add(yes);
		gengp.add(no);
		
		final JComboBox cbpm = new JComboBox();
		cbpm.addItem("Cash on Delivery");
		cbpm.addItem("Credit Card");
		cbpm.addItem("Online Transaction");
		cbpm.addItem("Debit Card");
		cbpm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbpm.setBounds(205, 414, 203, 27);
		frame.getContentPane().add(cbpm);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtname.setBounds(205, 117, 287, 40);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtphn = new JTextField();
		txtphn.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtphn.setColumns(10);
		txtphn.setBounds(205, 178, 287, 40);
		frame.getContentPane().add(txtphn);
		
		txttotal = new JTextField();
		txttotal.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txttotal.setColumns(10);
		txttotal.setBounds(187, 514, 287, 40);
		frame.getContentPane().add(txttotal);
		
		final JTextArea txtadd = new JTextArea();
		txtadd.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtadd.setWrapStyleWord(true);
		txtadd.setBounds(140, 232, 352, 106);
		frame.getContentPane().add(txtadd);
		
		final JCheckBox cbtc = new JCheckBox("Terms and conditions and Order to be delivered in 7 days");
		cbtc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cbtc.setBounds(39, 570, 506, 35);
		frame.getContentPane().add(cbtc);
		
		final JTextArea printtxt = new JTextArea();
		printtxt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		printtxt.setBounds(522, 185, 454, 371);
		frame.getContentPane().add(printtxt);
		
		JLabel printreceipt = new JLabel("Printed Receipt");
		printreceipt.setHorizontalAlignment(SwingConstants.CENTER);
		printreceipt.setFont(new Font("Times New Roman", Font.BOLD, 30));
		printreceipt.setBounds(582, 108, 321, 69);
		frame.getContentPane().add(printreceipt);
		
		final JLabel res = new JLabel("");
		res.setHorizontalAlignment(SwingConstants.CENTER);
		res.setFont(new Font("Times New Roman", Font.BOLD, 18));
		res.setBounds(568, 570, 382, 52);
		frame.getContentPane().add(res);
		
		final JButton print = new JButton("Print");
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == print) 
				{ 
					if (cbtc.isSelected()) 
					{ 
						String data1; 
						String data4 = null; 
						String data5 =null;
						String data6=""; 
						String data7=""; 
						String data8="";
						String data 
							= "Name : "
							+ txtname.getText() + "\n"
							+ "Phone number : "
							+ txtphn.getText() + "\n"; 
						if (yes.isSelected()) 
							{
							data1 = "Membership : Applicable (Rs. 1000 off) "
									+ "\n";
							}
						else
							{
							data1 = "Membership : No"
									+ "\r\n"; 
							}
						String data2 
						= "Payment mode : "
						+ (String)cbpm.getSelectedItem() 
						+ "\n"; 
						
						data5 ="Brands selected: " + "\n";
						if (canon.isSelected())
						{
						data6 = "canon" + "\n" ; 
						}
						
						if (nikon.isSelected())
						{
							data7 ="nikon" + "\n"; 
						}
						
						if (sony.isSelected())
						{
							data8 ="sony" + "\n"; 
						}

					String data3 = "Address : " + "\n" + txtadd.getText() + "\r\n" ; 
					if (yes.isSelected()) 
					{
					String a=txttotal.getText();
					int l=Integer.parseInt(a);
					int q = l-1000; 
					data4 = "Total: " +q;
					}
					if (no.isSelected()) 
					{
					data4 ="Total: " + txttotal.getText();
					}
					printtxt.setText(data+ data1 + data5 + data6 + data7 + data8 + data2 + data3 + data4); 
					printtxt.setEditable(false); 
					res.setText("Bill printed"); 
				} 
					else 
					{ 
						printtxt.setText(""); 
						res.setText("Please accept the"
									+ " terms & conditions"); 
					} 
				}
			
					}
			
		
		});
		print.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		print.setBounds(209, 614, 160, 42);
		frame.getContentPane().add(print);
		
		
		
		
	}
}
