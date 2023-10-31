package gui;
import javax.swing.JFrame;
public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame window= new JFrame();
		
		final int WINDOW_HEIGHT=250;
		final int WINDOW_WIDTH=250;
		
		window.setTitle("Simple Window");
		window.setSize(WINDOW_WIDTH, WINDOW_WIDTH);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
