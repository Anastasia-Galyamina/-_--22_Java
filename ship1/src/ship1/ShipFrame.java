package ship1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ShipFrame extends JFrame {
	
	ShipPanel panel;	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShipFrame frame = new ShipFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	public ShipFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new ShipPanel();
        panel.setBounds(100, 100, 450, 300);
        panel.Width = panel.getWidth(); 
        panel.Height = panel.getHeight();
		add(panel);		
	}
}
