package pkgproj;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.*;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class sony {
	

	JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sony window = new sony();
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
	public sony() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 990, 893);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon img211=new ImageIcon("images/logo.png");
		frame.setIconImage(img211.getImage());
		
		JLabel lblNewLabel = new JLabel("SONY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 80));
		lblNewLabel.setBounds(379, 10, 215, 97);
		frame.getContentPane().add(lblNewLabel);
		
		final JPanel panel1 = new JPanel();
		panel1.setBounds(51, 170, 888, 506);
		panel1.setBackground(new Color(255, 204, 102));
		panel1.setLayout(null);
		frame.getContentPane().add(panel1);
		panel1.setVisible(false);
		
		JTextArea txtrTrhouthgouto = new JTextArea();
		txtrTrhouthgouto.setBounds(209, 10, 495, 36);
		txtrTrhouthgouto.setFont(new Font("Minion Pro", Font.BOLD, 26));
		txtrTrhouthgouto.setText("A fully fledged toolkit for your imagination");
		panel1.add(txtrTrhouthgouto);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(31, 176, 135, 158);
		Image img =new ImageIcon(this.getClass().getResource("/sony.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		panel1.add(lblNewLabel_1);
		
		JTextPane txtpnNewlyDeveloped = new JTextPane();
		txtpnNewlyDeveloped.setEditable(false);
		txtpnNewlyDeveloped.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtpnNewlyDeveloped.setText("Newly developed 12.1 MP2 sensor and new BIONZ XRTM engine\r\nProfessional movie capture up to 4K/120p3\r\nHigh-performance hybrid autofocus optimised for still or video capture");
		txtpnNewlyDeveloped.setBounds(31, 344, 549, 126);
		panel1.add(txtpnNewlyDeveloped);
		
		JTextPane txtpnTheWorldsSmallest = new JTextPane();
		txtpnTheWorldsSmallest.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtpnTheWorldsSmallest.setText("The world's smallest and lightest1 stabilised full-frame camera body\r\n24.2 megapixel2 full-frame Exmor R\u2122 CMOS image sensor\r\nVersatile 4K movie recording for creators");
		txtpnTheWorldsSmallest.setBounds(191, 214, 639, 89);
		panel1.add(txtpnTheWorldsSmallest);
		
		JTextPane txtpnShootAtUp = new JTextPane();
		txtpnShootAtUp.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtpnShootAtUp.setText("Shoot at up to 11fps4 with minimal display lag, and 8fps4 with live view, in bursts of up to \r\n1165 shots in JPEG (Standard) at one time. With your settings clearly previewed in the \r\nelectronic viewfinder, and the virtually real-time display, it will elevate your action shooting \r\nto a whole new level.");
		txtpnShootAtUp.setBounds(30, 59, 800, 109);
		panel1.add(txtpnShootAtUp);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1 =new ImageIcon(this.getClass().getResource("/sony1.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(590, 313, 263, 187);
		panel1.add(lblNewLabel_2);
				
		final JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 204, 102));
		panel2.setBounds(51, 170, 888, 506);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		
		JLabel lblNewLabel_3 = new JLabel("Experience our worlds of imagination");
		lblNewLabel_3.setBounds(185, 20, 531, 39);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 33));
		panel2.add(lblNewLabel_3);
		
		JTextPane txtpnDesignedForContent = new JTextPane();
		txtpnDesignedForContent.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtpnDesignedForContent.setText("Designed for content creation: vari-angle LCD screen, body grip and recording lamp\r\nDirectional three-capsule mic with wind screen\r\nLarge 1.0-type Exmor RSTM CMOS image sensor and ZEISS\u00AE 24-70 mm1 lens");
		txtpnDesignedForContent.setBounds(22, 69, 622, 151);
		panel2.add(txtpnDesignedForContent);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img2 =new ImageIcon(this.getClass().getResource("/sony2.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(671, 69, 195, 159);
		panel2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img3 =new ImageIcon(this.getClass().getResource("/camera.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img3));
		lblNewLabel_5.setBounds(22, 248, 320, 256);
		panel2.add(lblNewLabel_5);
		
		JTextPane txtpnNewtypeStacked = new JTextPane();
		txtpnNewtypeStacked.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		txtpnNewtypeStacked.setText("New 1.0-type stacked CMOS sensor and ZEISS\u00AE 24\u2013200 mm1 lens\r\nWide and ultra-fast AF, with Eye AF and 20fps shooting3\r\n4K HDR (HLG) movies45, flip touchscreen and mic input");
		txtpnNewtypeStacked.setBounds(324, 282, 504, 184);
		panel2.add(txtpnNewtypeStacked);
		
		JButton btnNewButton = new JButton("MIRRORLESS");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 105, 180)));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 248, 220));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(51, 87, 201, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MIRROR");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(255, 248, 220));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(true);
				panel1.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(262, 87, 201, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(257, 200, 498, 432);
		frame.getContentPane().add(panel);
		panel.setVisible(true);
		panel.setLayout(null);
		
		JLabel label = new JLabel("SONY");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Minion Pro SmBd", Font.PLAIN, 99));
		label.setBounds(50, 132, 419, 182);
		panel.add(label);
	}
}
