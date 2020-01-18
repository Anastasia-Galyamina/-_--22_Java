package ship1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ParkingForm {
	private JFrame frame;
	private final int panelParkingWidth = 870;
	private final int panelParkingHeight = 460;
	private Parking<ITransport, IDeck> parking;
	private Ship ship;
	private IDeck deck;
	private ParkingPanel parkingPanel;		
	private JTextField textFieldIndex;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingForm window = new ParkingForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ParkingForm() {
		initialize();		
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1331, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		parkingPanel = new ParkingPanel(parking);
		parkingPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		parkingPanel.setBounds(10, 11, panelParkingWidth, panelParkingHeight);
		frame.getContentPane().add(parkingPanel); 	
		
 		JButton btnShip = new JButton("Ship");
		btnShip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
					Color mainColor = JColorChooser.showDialog(null, "Цвет", null);
				    	Color dopColor = JColorChooser.showDialog(null, "Цвет", null);
					ship = new Ship(100, 1000, mainColor, dopColor);					
					ship.GetRandom();					
					parking.addShip(ship, ship.deck);										
			}
		});
		btnShip.setBounds(900, 11, 97, 25);
		frame.getContentPane().add(btnShip);

 		JButton btnMotorShip = new JButton("MotorShip");
 		btnMotorShip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
					Color mainColor = JColorChooser.showDialog(null, "Цвет", null);
				    	Color dopColor = JColorChooser.showDialog(null, "Цвет", null);
				    	Color SecondDopColor = JColorChooser.showDialog(null, "Цвет", null);
					ship = new MotorShip(100, 1000, mainColor, dopColor, SecondDopColor,  true);
					ship.GetRandom();
					parking.addShip(ship, ship.deck);
			}		
			
		});	
		btnMotorShip.setBounds(900, 49, 97, 25);
		frame.getContentPane().add(btnMotorShip);
		
		JLabel label = new JLabel("Take ship:");
		label.setBounds(900, 199, 122, 14);
		frame.getContentPane().add(label);

 		JLabel label_1 = new JLabel("place:");
		label_1.setBounds(900, 224, 48, 14);
		frame.getContentPane().add(label_1);

 		textFieldIndex = new JTextField();
		textFieldIndex.setBounds(950, 226, 51, 22);
		frame.getContentPane().add(textFieldIndex);
		textFieldIndex.setColumns(10);
		
		TakePanel takePanel = new TakePanel();
		takePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
 		takePanel.setBounds(900, 300, 220, 110);
		frame.getContentPane().add(takePanel);

 		JButton btnTake = new JButton("Take");
 		btnTake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldIndex.getText() != "") {
					ITransport transport = parking.checkTransportAtIndex(Integer.parseInt(textFieldIndex.getText()));
					IDeck deck = parking.checkDecksAtIndex(Integer.parseInt(textFieldIndex.getText()));
					if (transport != null) {						
						transport.SetPosition(10, 10, takePanel.getWidth(), takePanel.getHeight());
						deck.SetPosition(10, 10);
						takePanel.SetTransport(transport, deck);
						takePanel.repaint();
						parking.deleteShip(Integer.parseInt(textFieldIndex.getText()));											
					}
				}
			}
		});
		btnTake.setBounds(900, 164, 97, 25);
		frame.getContentPane().add(btnTake);
		parking = new Parking<ITransport, IDeck>(20, parkingPanel.getWidth(), parkingPanel.getHeight());
		parkingPanel.setParking(parking);
	    parkingPanel.repaint();
	    takePanel.repaint(); 		
	}	
}

