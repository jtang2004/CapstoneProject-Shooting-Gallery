import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShootingGallery {
	public static void main(String[] args) {
		JFrame ShootingGallery= new JFrame("ShootingGallery");
		ShootingGallery.setBounds(0, 0, 800, 600);
		ShootingGallery.getContentPane().setBackground(Color.WHITE);
		ShootingGallery.setResizable(false); 
		ShootingGallery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShootingGallery.setVisible(true);
		ShootingGallery.setVisible(true);
		Gallery panel = new Gallery();
		panel.setBackground(Color.WHITE);
		ShootingGallery.add(panel);
	}
}
