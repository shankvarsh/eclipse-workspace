package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JProgressBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class menubar {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menubar window = new menubar();
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
	public menubar() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.setBounds(0, 0, 133, 36);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("open");
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("calculator");
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator window = new calculator();
				window.frame.setVisible(true);
			}
		});
		
		JMenu mnNewMenu_2 = new JMenu("calc");
		mnNewMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("calculate");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new calc();
			}
			
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("bill");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bill();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("threepanels");
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threepanels window = new threepanels();
				window.frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("run");
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("panel");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel window = new panel();
				window.frame.setVisible(true);
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("testregistration");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyFrame f = new MyFrame();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
	}
}
