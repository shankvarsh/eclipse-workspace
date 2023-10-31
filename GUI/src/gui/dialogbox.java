package gui;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SampleOption extends WindowAdapter
{
	JFrame f;
	JLabel lblMessage;
	
	SampleOption()
	{
		f=new JFrame();
		f.setLayout(null);
		f.setBounds(300,300,300,300);
		f.setTitle("Action");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.addWindowListener(this);
		String name=JOptionPane.showInputDialog(f,"Please enter your name");
		
		JOptionPane.showMessageDialog(f,"Welcome" +name,"Alert",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(f,"Welcome","message",JOptionPane.INFORMATION_MESSAGE);
	}
		public void windowClosing(WindowEvent e)
		{
			int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
			if(a==JOptionPane.YES_OPTION)
			{
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
}

public class dialogbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new SampleOption();
	}

}
