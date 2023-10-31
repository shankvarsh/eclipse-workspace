package assignment45;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Q42 extends JFrame {
	public Q42(){
		setTitle("Calcute the Factorial of a number!");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		JLabel label1=new JLabel("Give input");
		JTextField inputf=new JTextField(20);
		
		
		JLabel label2=new JLabel("Result");
		JTextField result=new JTextField(20);
		
		
		JButton button=new JButton("Compute");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				factorial();
			}
			void factorial()
			{
				try {
				int a=Integer.parseInt(inputf.getText());
				int fact=1;
				
				if(a<0)
				{
					result.setText("Enter positive numbers");
				}
				else
				{
					for(int i=1;i<=a;i++)
					{
						fact=fact*i;
					}
					result.setText(String.valueOf(fact));
				}
				}
				catch(NumberFormatException x)
				{
					result.setText("Invalid input");
				}
			}
		
		
		
	});
		add(label1);
		add(inputf);
		add(label2);
		add(result);
		add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Q42();
			System.out.println("askjhkjfbdi");
	}
}
