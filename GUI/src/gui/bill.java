package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class bill extends JFrame implements ActionListener
{
	private JLabel title; 
	JTextField txtMessage0;
	JTextField txtMessage1;
	JTextField txtMessage2;
	JTextField txtMessage3;
	JTextField txtMessage4;
	JTextField txtMessage5;
	JFrame f;
	JButton btnAction;
	JLabel lblMessage0;
	JLabel lblMessage1;
	JLabel lblMessage2;
	JLabel lblMessage3;
	JLabel lblMessage4;
	JLabel lblMessage5;
	JLabel lblMessage6;
	
	public bill()
	{
		f=new JFrame();
		f.setLayout(null);
		f.setBounds(500,500,500,500);
		f.setTitle("Bill");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		title = new JLabel("THE BIG STORE"); 
		title.setSize(300, 30); 
		title.setLocation(250, 10); 
		f.getContentPane().add(title); 
		
		title = new JLabel("Quantity"); 
		title.setSize(300, 30); 
		title.setLocation(300, 30); 
		f.getContentPane().add(title); 
					
		title = new JLabel("Cost"); 
		title.setSize(300, 30); 
		title.setLocation(200, 30); 
		f.getContentPane().add(title); 
		
		txtMessage0= new JTextField();
		txtMessage0.setSize(100,20);
		txtMessage0.setLocation(200,100);
		f.getContentPane().add(txtMessage0);
		
		txtMessage1= new JTextField();
		txtMessage1.setSize(100,20);
		txtMessage1.setLocation(200,150);
		f.getContentPane().add(txtMessage1);
		
		txtMessage2= new JTextField();
		txtMessage2.setSize(100,20);
		txtMessage2.setLocation(200,200);
		f.getContentPane().add(txtMessage2);
		
		txtMessage3= new JTextField();
		txtMessage3.setSize(100,20);
		txtMessage3.setLocation(300,100);
		f.getContentPane().add(txtMessage3);
		
		txtMessage4= new JTextField();
		txtMessage4.setSize(100,20);
		txtMessage4.setLocation(300,150);
		f.getContentPane().add(txtMessage4);
		
		txtMessage5= new JTextField();
		txtMessage5.setSize(100,20);
		txtMessage5.setLocation(300,200);
		f.getContentPane().add(txtMessage5);
		
		btnAction=new JButton();
		btnAction.setBounds(100,300,100,20);
		btnAction.setText("Total");
		
		btnAction.addActionListener(this);
		f.getContentPane().add(btnAction);
		
		lblMessage0=new JLabel("Pen");
		lblMessage0.setSize(100, 20); 
		lblMessage0.setLocation(100, 100); 
		f.getContentPane().add(lblMessage0);
		
		lblMessage1=new JLabel("Eraser");
		lblMessage1.setSize(100, 20); 
		lblMessage1.setLocation(100, 150); 
		f.getContentPane().add(lblMessage1);
		
		lblMessage2=new JLabel("Sketchpen");
		lblMessage2.setSize(100, 20); 
		lblMessage2.setLocation(100, 200); 
		f.getContentPane().add(lblMessage2);
		
		lblMessage3=new JLabel();
		lblMessage3.setBounds(100,400,100,20);
		f.getContentPane().add(lblMessage3);
		
		lblMessage4=new JLabel();
		lblMessage4.setSize(100, 20); 
		lblMessage4.setLocation(400, 100); 
		f.getContentPane().add(lblMessage4);
		
		lblMessage5=new JLabel();
		lblMessage5.setSize(100, 20); 
		lblMessage5.setLocation(400, 150); 
		f.getContentPane().add(lblMessage5);
		
		lblMessage6=new JLabel();
		lblMessage6.setSize(100, 20); 
		lblMessage6.setLocation(400, 200); 
		f.getContentPane().add(lblMessage6);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String a=txtMessage0.getText();
		String b=txtMessage1.getText();
		String c=txtMessage2.getText();
		String d=txtMessage3.getText();
		String g=txtMessage4.getText();
		String f=txtMessage5.getText();
		int l=Integer.parseInt(a);
		int m=Integer.parseInt(b);
		int n=Integer.parseInt(c);
		int o=Integer.parseInt(d);
		int p=Integer.parseInt(g);
		int q=Integer.parseInt(f);
		int z=l*o;
		int x=m*p;
		int y=n*q; 
		int k=z+x+y;
		lblMessage3.setText("Total is "+k);
		lblMessage4.setText("Total is "+z);
		lblMessage5.setText("Total is "+x);
		lblMessage6.setText("Total is "+y);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new bill();
	
	}

}
