package ship1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ParkingPanel extends JPanel {
	Parking<ITransport, IDeck> parking;
	public ParkingPanel(Parking<ITransport, IDeck> parking) {
		this.parking = parking;
	}
	public Parking <ITransport, IDeck> getParking() {
		return parking;
	}
	public void setParking(Parking<ITransport, IDeck> parking) {
		this.parking = parking;
	}	
	public void paint(Graphics g) {
		super.paint(g);
		parking.Draw(g);
		repaint();
	}
}
