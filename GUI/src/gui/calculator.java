package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;

public class calculator {

	JFrame frame;
	private JTextField textField;
double firstnum;
double secondnum;
double result;
String operation;
String ans;
	/**
	 * Launch the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 509, 631);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GRAY));
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 35));
		textField.setBounds(10, 10, 475, 141);
		frame.getContentPane().add(textField);
		textField.setColumns(15);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn0.setForeground(Color.RED);
		btn0.setBounds(105, 498, 85, 72);
		frame.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"8");
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn8.setForeground(Color.RED);
		btn8.setBounds(105, 416, 85, 72);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"5");
			}
		});
		btn5.setForeground(Color.RED);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn5.setBounds(105, 334, 85, 72);
		frame.getContentPane().add(btn5);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"9");
			}
		});
		
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn9.setForeground(Color.RED);
		btn9.setBounds(200, 416, 85, 72);
		frame.getContentPane().add(btn9);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"2");
			}
		});
		btn2.setForeground(Color.RED);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn2.setBounds(105, 252, 85, 72);
		frame.getContentPane().add(btn2);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"6");
			}
		});
		
		btn6.setForeground(Color.RED);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn6.setBounds(200, 334, 85, 72);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"3");
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn3.setForeground(Color.RED);
		btn3.setBounds(200, 252, 85, 72);
		frame.getContentPane().add(btn3);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"1");
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn1.setForeground(Color.RED);
		btn1.setBounds(10, 252, 85, 72);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +"4");
			}
		});
		btn4.setForeground(Color.RED);
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn4.setBounds(10, 334, 85, 72);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn7.setForeground(Color.RED);
		btn7.setBounds(10, 416, 85, 72);
		frame.getContentPane().add(btn7);
		
		JButton bthdot = new JButton(".");
		bthdot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() +".");
			}
		});
		
		bthdot.setForeground(Color.RED);
		bthdot.setFont(new Font("Times New Roman", Font.BOLD, 30));
		bthdot.setBounds(200, 498, 85, 72);
		frame.getContentPane().add(bthdot);
		
		JButton btnplus = new JButton("+");
		btnplus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("+");
				operation="+";
			}
		});
		btnplus.setForeground(Color.RED);
		btnplus.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnplus.setBounds(306, 252, 85, 72);
		frame.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("-");
				operation="-";
			}
		});
		
		btnminus.setForeground(Color.RED);
		btnminus.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnminus.setBounds(400, 252, 85, 72);
		frame.getContentPane().add(btnminus);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		
		btnmultiply.setForeground(Color.RED);
		btnmultiply.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnmultiply.setBounds(306, 334, 85, 72);
		frame.getContentPane().add(btnmultiply);
		
		JButton btndivide = new JButton("/");
		btndivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		
		btndivide.setForeground(Color.RED);
		btndivide.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btndivide.setBounds(400, 334, 85, 72);
		frame.getContentPane().add(btndivide);
		
		JButton btnper = new JButton("%");
		btnper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		
		btnper.setForeground(Color.RED);
		btnper.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnper.setBounds(306, 416, 85, 72);
		frame.getContentPane().add(btnper);
		
		JButton btnClear = new JButton("C");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnClear.setBounds(10, 170, 275, 72);
		frame.getContentPane().add(btnClear);
		
		JButton btnequalto = new JButton("=");
		btnequalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String answer;
			secondnum =Double.parseDouble(textField.getText());
			if (operation =="+")
			{
				result=firstnum+secondnum;
				answer=String.format("%.2f", result);
				textField.setText(answer);
			}
				if (operation =="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if (operation =="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
					if (operation =="/")
					{
						result=firstnum/secondnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					if (operation =="%")
					{
						result=firstnum % secondnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					if (operation =="x^2")
					{
						result=firstnum*firstnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
			}
		});
		btnequalto.setForeground(Color.RED);
		btnequalto.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnequalto.setBounds(306, 498, 179, 72);
		frame.getContentPane().add(btnequalto);
		
		JButton btnsq = new JButton("x^2");
		btnsq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText(""+firstnum);
				operation="x^2";
			}
		});
		btnsq.setForeground(Color.RED);
		btnsq.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnsq.setBounds(400, 416, 85, 72);
		frame.getContentPane().add(btnsq);
		
		JButton btnDel = new JButton("Del");
		btnDel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int length=textField.getText().length();
				int number=textField.getText().length()-1;
				String store;
				
				if(length>0)
				{
					StringBuilder back=new StringBuilder(textField.getText());
				back.deleteCharAt(number);
				store=back.toString();
				textField.setText(store);
				}
			}
		});
		btnDel.setForeground(Color.RED);
		btnDel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnDel.setBounds(306, 170, 179, 72);
		frame.getContentPane().add(btnDel);
		
		JButton btnN = new JButton("+\\-");
		btnN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double ops= Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnN.setForeground(Color.RED);
		btnN.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnN.setBounds(10, 498, 85, 72);
		frame.getContentPane().add(btnN);
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
