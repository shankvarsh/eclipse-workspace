
import java.awt.*;
import javax.swing.*;
public class Welcome {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
JFrame frame= new JFrame("Simple");
    frame.pack();
    frame.setVisible(true);
    frame.setBounds(200,200,400,400);
    JButton b1=new JButton("North");
    JButton b2=new JButton("South");
    JButton b3=new JButton("East");
    JButton b4=new JButton("West");
    JButton b5=new JButton("Center");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(b1,BorderLayout.NORTH);
    frame.getContentPane().add(b2,BorderLayout.SOUTH);
    frame.getContentPane().add(b3,BorderLayout.EAST);
    frame.getContentPane().add(b4,BorderLayout.WEST);
    frame.getContentPane().add(b5,BorderLayout.CENTER);
    
    
  }
  
}