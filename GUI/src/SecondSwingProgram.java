
import java.awt.*;
import javax.swing.*;
public class SecondSwingProgram {

  public static void main(String[] args) {
    JFrame jf=new JFrame("second frame");
    JButton b1=new JButton("North");
    JButton b2=new JButton("South");
    jf.pack();
    jf.setVisible(true);
    jf.setBounds(200,200,400,400);

    Container pane=jf.getContentPane();
    pane.setLayout(new BorderLayout(20,20));
    JPanel panel=new JPanel(new FlowLayout());
    panel.add(new Button ("b1"));
    panel.add(new Button ("b2"));
pane.add(panel,BorderLayout.CENTER);
  }

}