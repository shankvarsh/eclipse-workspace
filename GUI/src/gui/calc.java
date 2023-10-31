package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calc extends JFrame implements ActionListener
{
	JTextField txtMessage;
	JFrame f;
	JButton btnAction;
	JLabel lblMessage;
	
	calc()
	{
		f=new JFrame();
		f.setLayout(null);
		f.setBounds(300,300,300,300);
		f.setTitle("Action");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		txtMessage= new JTextField();
		txtMessage.setSize(200,30);
		txtMessage.setLocation(50,50);
		f.getContentPane().add(txtMessage);
		
		btnAction=new JButton();
		btnAction.setBounds(100,100,100,20);
		btnAction.setText("Click");
		btnAction.addActionListener(this);
		f.getContentPane().add(btnAction);
		
		lblMessage=new JLabel();
		lblMessage.setBounds(100,150,200,20);
		f.getContentPane().add(lblMessage);
	}
	 
	public void actionPerformed(ActionEvent e)
	{
		String aa=txtMessage.getText();
		int a=Integer.parseInt(aa);
		int z=a*a*a;
		lblMessage.setText("Cube of "+a+" is "+z);
		
	}

	public static void main(String[] args) {
		new calc();
	}

}
