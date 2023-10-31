package gui;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 
public class testclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frame frame= new Frame();
		
		frame.setSize(250, 250);
		frame.setTitle("AWT WINDOW");
		 frame.addWindowListener(new MyWindowListener());
	      frame.setVisible(true);
	   }
	   static class MyWindowListener extends WindowAdapter 
	   {
	      public void windowClosing(WindowEvent e) 
	      {
	         System.exit(0);
	}
}
}
