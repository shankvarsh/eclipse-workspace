package pkgproj;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.*;


public class Main {

	private JFrame frame;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					
					Main window = new Main();
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
	public Main() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(216, 191, 216));
		frame.getContentPane().setLayout(null);
		ImageIcon img=new ImageIcon("images/logo.png");
		frame.setIconImage(img.getImage());
		String name=JOptionPane.showInputDialog(frame,"Please enter your name");
		JOptionPane.showMessageDialog(frame,"Welcome " +name,"Alert",JOptionPane.PLAIN_MESSAGE);
		
		
		JLabel lblNewLabel = new JLabel("The Cam Store");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Hobo Std", Font.ITALIC, 99));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 124, 766, 122);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img1 =new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(247, 244, 297, 273);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Since 2001");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Giddyup Std", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(134, 459, 530, 138);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Build your passion with the best cameras!");
		lblNewLabel_3.setForeground(new Color(255, 69, 0));
		lblNewLabel_3.setBackground(new Color(230, 230, 250));
		lblNewLabel_3.setFont(new Font("Myriad Hebrew", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(222, 207, 357, 65);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(112, 128, 144));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("About");
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Stock");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stock window = new stock();
				window.frame.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Products");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sony");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sony window = new sony();
				window.frame.setVisible(true);
			}
		});
		mntmNewMenuItem.setFont(new Font("SansSerif", Font.BOLD, 20));
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Canon");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canon window = new canon();
				window.frame.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Nikon");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nikon window = new nikon();
				window.frame.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("SansSerif", Font.BOLD, 20));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Print");
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Bill");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bill window = new bill();
				window.frame.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New list");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableSample window = new tableSample();
				window.frame.setVisible(true);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mnNewMenu_2.add(mntmNewMenuItem_5);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	

	

	
}
