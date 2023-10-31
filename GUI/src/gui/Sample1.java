package gui;
import java.awt.event.*;
import javax.swing.*;
public class Sample1 extends JFrame implements ActionListener
{
	JTextField txtMessage;
	JFrame f;
	JButton btnAction;
	Sample1()
	{
		f=new JFrame();
		f.setLayout(null);
		f.setBounds(300,300,300,300);
		f.setTitle("Action");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtMessage= new JTextField();
		txtMessage.setSize(200,30);
		txtMessage.setLocation(50,50);
		f.getContentPane().add(txtMessage);
		
		btnAction=new JButton();
		btnAction.setBounds(100,100,100,20);
		btnAction.setText("Click");
		btnAction.addActionListener(this);
		f.getContentPane().add(btnAction);
	}
	public void actionPerformed(ActionEvent e)
	{
		txtMessage.setText("Welcome");
	}
	public static void main(String[] args) 
	{
		new Sample1();
	}

}
