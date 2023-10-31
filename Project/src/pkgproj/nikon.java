package pkgproj;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




public class nikon {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nikon window = new nikon();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public nikon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 153, 153));
		frame.setBounds(100, 100, 1101, 766);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon img=new ImageIcon("images/logo.png");
		frame.setIconImage(img.getImage());
		
		JLabel lblNewLabel = new JLabel("NIKON");
		lblNewLabel.setBounds(403, 28, 196, 65);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trajan Pro", Font.PLAIN, 45));
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 543, 1014, 176);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtrOhgogoihrosihgoidnfglndfoihvondfognoidfhgodnfgnoidfhbonfdgnoidDfgnjdfgbdfjgnijdfbvjbvdfkgnjidfbjdfngjibdifbkjdnguodfjbndfDfngjdfnjogndkfngoidfhglknreoihtoierhtoerytoierioyoiyuyyoiyoiyoiyoiyoiyoiyoiyoiyoioiyoyouiyouiyouiyouiyoiuyoouyoyotysrigidfbgkvbirugkjdfiljg = new JTextArea();
		txtrOhgogoihrosihgoidnfglndfoihvondfognoidfhgodnfgnoidfhbonfdgnoidDfgnjdfgbdfjgnijdfbvjbvdfkgnjidfbjdfngjibdifbkjdnguodfjbndfDfngjdfnjogndkfngoidfhglknreoihtoierhtoerytoierioyoiyuyyoiyoiyoiyoiyoiyoiyoiyoiyoioiyoyouiyouiyouiyouiyoiuyoouyoyotysrigidfbgkvbirugkjdfiljg.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		txtrOhgogoihrosihgoidnfglndfoihvondfognoidfhgodnfgnoidfhbonfdgnoidDfgnjdfgbdfjgnijdfbvjbvdfkgnjidfbjdfngjibdifbkjdnguodfjbndfDfngjdfnjogndkfngoidfhglknreoihtoierhtoerytoierioyoiyuyyoiyoiyoiyoiyoiyoiyoiyoiyoioiyoyouiyouiyouiyouiyoiuyoouyoyotysrigidfbgkvbirugkjdfiljg.setText("NIKON D3500\r\nType: DSLR | Sensor: APS-C CMOS | Megapixels: 24.2MP | Lens mount: Nikon DX | Screen: 3in fixed, 921K dots | \r\nContinuous shooting speed: 5fps | Max video resolution: 1080p | User level: Beginner/enthusiast\r\n\r\nNIKON D5200\r\nType: DSLR | Sensor: APS-C | Megapixels: 20.9MP | Lens mount: Nikon DX | Screen: 3.2in tilting touchscreen, 922,000 dots | \r\nViewfinder: Pentaprism | Max burst speed: 8fps | Max video resolution: 4K | User level: Enthusiast\r\n\r\nNIKON MARKX\r\nType: DSLR | Sensor: Full frame | Megapixels: 24.4MP | Lens mount: Nikon FX | Screen: 3.2in tilting screen, 2,359k dots | \r\nViewfinder: Pentaprism | Max burst speed: 7/12fps | Max video resolution: 4K UHD | User level: Enthusiast/professional\r\n\r\nNIKON D7200\r\nType: DSLR | Sensor: Full frame | Megapixels: 24.3MP | Lens mount: Nikon F | Screen: 3.2in tilting touchscreen, 1,228,000 dots | \r\nViewfinder: Optical | Max burst speed: 6.5fps | Max video resolution: 1080p | User level: Enthusiast/professional");
		scrollPane.setViewportView(txtrOhgogoihrosihgoidnfglndfoihvondfognoidfhgodnfgnoidfhbonfdgnoidDfgnjdfgbdfjgnijdfbvjbvdfkgnjidfbjdfngjibdifbkjdnguodfjbndfDfngjdfnjogndkfngoidfhglknreoihtoierhtoerytoierioyoiyuyyoiyoiyoiyoiyoiyoiyoiyoiyoioiyoyouiyouiyouiyouiyoiuyoouyoyotysrigidfbgkvbirugkjdfiljg);
		txtrOhgogoihrosihgoidnfglndfoihvondfognoidfhgodnfgnoidfhbonfdgnoidDfgnjdfgbdfjgnijdfbvjbvdfkgnjidfbjdfngjibdifbkjdnguodfjbndfDfngjdfnjogndkfngoidfhglknreoihtoierhtoerytoierioyoiyuyyoiyoiyoiyoiyoiyoiyoiyoiyoioiyoyouiyouiyouiyouiyoiuyoouyoyotysrigidfbgkvbirugkjdfiljg.setWrapStyleWord(true);
		
		JLabel lblNewLabel_1 = new JLabel("NIKON D3500");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblNewLabel_1.setBounds(36, 52, 403, 225);
		frame.getContentPane().add(lblNewLabel_1);
		Image img1 =new ImageIcon(this.getClass().getResource("/nikon1.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		
		JLabel lblNewLabel_2 = new JLabel("NIKON D5200");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(31, 267, 420, 251);
		frame.getContentPane().add(lblNewLabel_2);
		Image img2 =new ImageIcon(this.getClass().getResource("/nikon.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_3 = new JLabel("NIKON MARKX");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblNewLabel_3.setBounds(640, 52, 333, 189);
		frame.getContentPane().add(lblNewLabel_3);
		Image img3 =new ImageIcon(this.getClass().getResource("/nik.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		
		JLabel lblNewLabel_4 = new JLabel("NIKON D7200");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblNewLabel_4.setBounds(573, 229, 451, 263);
		frame.getContentPane().add(lblNewLabel_4);
		Image img7 =new ImageIcon(this.getClass().getResource("/camera.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img7));
		
	}
}
