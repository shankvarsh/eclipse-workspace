package pkgproj;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JPanel;

public class canon {

	JFrame frame;
	private ButtonGroup gengp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					canon window = new canon();
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
	public canon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 153));
		frame.setBounds(100, 100, 1024, 894);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon img101=new ImageIcon("images/logo.png");
		frame.setIconImage(img101.getImage());
		
		final JPanel panel = new JPanel();
		panel.setBackground(new Color(210, 105, 30));
		panel.setBounds(136, 344, 731, 199);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(716, -1, 294, 225);
		frame.getContentPane().add(lblNewLabel_1);
		Image img =new ImageIcon(this.getClass().getResource("/canon.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		
		final JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(473, 87, 163, 157);
		frame.getContentPane().add(lblNewLabel_2);
		Image img1 =new ImageIcon(this.getClass().getResource("/canoncf.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setVisible(false);
		
		final JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(296, 87, 141, 144);
		frame.getContentPane().add(lblNewLabel_3);
		Image img3 =new ImageIcon(this.getClass().getResource("/canonff.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		lblNewLabel_3.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("CANON");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(372, 21, 212, 66);
		frame.getContentPane().add(lblNewLabel);
		
		final JTextPane txtpnASystemDesigned = new JTextPane();
		txtpnASystemDesigned.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		txtpnASystemDesigned.setText("A system designed for the future, today.\r\nBuilding on over three decades of continuous EOS innovation, the EOS R System is based around a pioneering lens mount which offers greater creative possibilities and even more dynamic ways of capturing every moment. It redefines the boundaries of photography and filmmaking.");
		txtpnASystemDesigned.setBounds(236, 409, 492, 171);
		frame.getContentPane().add(txtpnASystemDesigned);
		txtpnASystemDesigned.setVisible(false);
		
		final JTextPane txtpnTheRfLens = new JTextPane();
		txtpnTheRfLens.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		txtpnTheRfLens.setText("The RF lens mount is at the heart of the EOS R System. It is an uncompromising balance of optical, mechanical and electronic engineering excellence enabling innovative full-frame lens designs, faster autofocus and high-speed communication between the camera and lens.");
		txtpnTheRfLens.setBounds(236, 590, 492, 131);
		frame.getContentPane().add(txtpnTheRfLens);
		txtpnTheRfLens.setVisible(false);
		
		final JTextPane txtpnWithDualPixel = new JTextPane();
		txtpnWithDualPixel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		txtpnWithDualPixel.setText("With Dual Pixel CMOS AF, the EOS R System offers the world\u2019s fastest autofocus at 0.05 seconds1 and high-resolution capture. Achieve greater creative possibilities with incredible detail and sharpness.");
		txtpnWithDualPixel.setBounds(236, 254, 492, 141);
		frame.getContentPane().add(txtpnWithDualPixel);
		txtpnWithDualPixel.setVisible(false);
		
		final JTextPane txtpnTheEosR = new JTextPane();
		txtpnTheEosR.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtpnTheEosR.setText("The EOS R System is designed to complement and expand your creative possibilities. Offering you an intuitive way of shooting, it can fit into your existing EOS system with ease and take you to new places as a photographer or filmmaker thanks to the phenomenal RF lenses plus compatibility with the EF and EF-S range.");
		txtpnTheEosR.setBounds(38, 366, 962, 131);
		frame.getContentPane().add(txtpnTheEosR);
		txtpnTheEosR.setVisible(false);
		
		final JTextPane txtpnEosRSystem = new JTextPane();
		txtpnEosRSystem.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtpnEosRSystem.setText("EOS R System adapters are unique and offer additional creative control, enabling photographers and filmmakers to use their existing EF and EF-S lenses with full compatibility and no loss in performance.");
		txtpnEosRSystem.setBounds(168, 254, 699, 102);
		frame.getContentPane().add(txtpnEosRSystem);
		txtpnEosRSystem.setVisible(false);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("FULL FRAME");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_3.setVisible(true);
				lblNewLabel_2.setVisible(false);
				txtpnTheEosR.setVisible(false);
				txtpnEosRSystem.setVisible(false);
				txtpnTheRfLens.setVisible(true);
				txtpnASystemDesigned.setVisible(true);
				txtpnWithDualPixel.setVisible(true);
				panel.setVisible(false);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Trajan Pro", Font.BOLD, 24));
		rdbtnNewRadioButton.setBounds(38, 87, 220, 66);
		frame.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CROP FRAME");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setVisible(true);
				txtpnTheEosR.setVisible(true);
				txtpnEosRSystem.setVisible(true);
				txtpnTheRfLens.setVisible(false);
				txtpnASystemDesigned.setVisible(false);
				txtpnWithDualPixel.setVisible(false);
				lblNewLabel_3.setVisible(false);
				panel.setVisible(false);
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Trajan Pro", Font.BOLD, 24));
		rdbtnNewRadioButton_1.setBounds(38, 158, 220, 66);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setSelected(false);
		
		gengp = new ButtonGroup(); 
		gengp.add(rdbtnNewRadioButton);
		gengp.add(rdbtnNewRadioButton_1);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("CANON");
		lblNewLabel_4.setFont(new Font("Trajan Pro", Font.PLAIN, 40));
		lblNewLabel_4.setForeground(new Color(176, 224, 230));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(112, 59, 524, 92);
		panel.add(lblNewLabel_4);
		
		
		
		
		
		
		
	}
}
