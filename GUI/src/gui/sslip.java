package gui;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class sslip extends WindowAdapter 
{
	
	
	private JLabel title; 
	
	JLabel empid;
	JLabel lblMessage0;
	
	JLabel empname;
	JLabel lblMessage1;
	
	JLabel desig;
	JLabel lblMessage2;
	
	JLabel basicsalary;
	JTextField lblMessage3;
	
	JLabel netsalary;
	JTextField lblMessage4;
	
	JLabel allowance;
	JTextField lblMessage5;
	
	JLabel deduction;
	JTextField  lblMessage6;
	
	JFrame f;
	
   public sslip()
	{
	  
		String name=JOptionPane.showInputDialog(f,"Employee name");
		String id=JOptionPane.showInputDialog(f,"Employee id");
		String des=JOptionPane.showInputDialog(f,"Employee designation");
		String ebs=JOptionPane.showInputDialog(f,"Employee basic salary");
		int bs=Integer.parseInt(ebs);
				
		f=new JFrame();
		f.setLayout(null);
		f.setBounds(500,500,500,500);
		f.setTitle("Salary slip");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		title = new JLabel("SALARY SLIP FOR THE MOTH OF APRIL"); 
		title.setSize(300, 30); 
		title.setLocation(250, 10); 
		f.getContentPane().add(title); 
		
		empid=new JLabel("EMPLOYEE ID");
		empid.setSize(100, 20); 
		empid.setLocation(100, 100); 
		f.getContentPane().add(empid);
		
		lblMessage0=new JLabel(id);
		lblMessage0.setSize(100, 20); 
		lblMessage0.setLocation(200, 100); 
		f.getContentPane().add(lblMessage0);
		
		empname=new JLabel("EMP NAME");
		empname.setSize(100,20); 
		empname.setLocation(100, 150); 
		f.getContentPane().add(empname);
		
		lblMessage1=new JLabel(name);
		lblMessage1.setSize(100, 20); 
		lblMessage1.setLocation(200, 150); 
		f.getContentPane().add(lblMessage1);
		
		desig=new JLabel("DESIGNATION");
		desig.setSize(100, 20); 
		desig.setLocation(100, 200); 
		f.getContentPane().add(desig);
		
		lblMessage2=new JLabel(des);
		lblMessage2.setSize(100, 20); 
		lblMessage2.setLocation(200, 200); 
		f.getContentPane().add(lblMessage2);
		
		basicsalary=new JLabel("Basic salary");
		basicsalary.setSize(100, 20); 
		basicsalary.setLocation(100, 300); 
		f.getContentPane().add(basicsalary);
		
		lblMessage3= new JTextField(ebs);
		lblMessage3.setSize(100, 20); 
		lblMessage3.setLocation(200, 300); 
		f.getContentPane().add(lblMessage3);
		
		netsalary=new JLabel("net salary");
		netsalary.setSize(100, 20); 
		netsalary.setLocation(100, 350); 
		f.getContentPane().add(netsalary);
		
		lblMessage4=new JTextField ();
		lblMessage4.setSize(100, 20); 
		lblMessage4.setLocation(200, 350); 
		f.getContentPane().add(lblMessage4);
		
		allowance=new JLabel("allowance");
		allowance.setSize(100, 20); 
		allowance.setLocation(400, 300); 
		f.getContentPane().add(allowance);
		
		lblMessage5=new JTextField ();
		lblMessage5.setSize(100, 20); 
		lblMessage5.setLocation(500, 300); 
		f.getContentPane().add(lblMessage5);
		
		deduction=new JLabel ("deduction");
		deduction.setSize(100, 20); 
		deduction.setLocation(400, 400); 
		f.getContentPane().add(deduction);
		
		lblMessage6=new JTextField ();
		lblMessage6.setSize(100, 20); 
		lblMessage6.setLocation(500,400); 
		f.getContentPane().add(lblMessage6);
		
    double v=Integer.parseInt(lblMessage3.getText()); 
	double r= v*0.1; 
	lblMessage5.setText("Rs. "+r); 
	lblMessage6.setText("2000");
	double p=(v+r)-Integer.parseInt(lblMessage6.getText());
	lblMessage4.setText("Rs. "+p); 

	f.addWindowListener(this);
	}
    public void windowClosing(WindowEvent e)
	{
		int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
		if(a==JOptionPane.YES_OPTION)
		{
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
   
	public static void main(String[] args) 
	{
		new sslip();
	}
	
		
	}


