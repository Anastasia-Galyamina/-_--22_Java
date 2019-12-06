package ship1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShipPanel extends JPanel {
	ITransport ship;
	IDeck deck;
	public int Height;
	public int Width;
	public ShipPanel() {
		
		JButton buttonRight = new JButton("\u0412\u043F\u0440\u0430\u0432\u043E");
		 buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ship!=null)
				ship.MoveTransport(Direction.Right);
				repaint();
			}
		});
		add(buttonRight);
		
		JButton buttonCreateShip = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C");
		buttonCreateShip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	  
                Random rnd = new Random();
                ship = new Ship(100, 1000, Color.WHITE, Color.BLUE);
                ship.SetPosition(rnd.nextInt(90)+10, rnd.nextInt(90)+10, Width, Height);                
				repaint();
			}
		});
		add(buttonCreateShip);
		
		JButton buttonCreateMotorShip = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C");
		buttonCreateMotorShip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	  
                Random rnd = new Random();
                ship = new MotorShip(100, 1000, Color.WHITE, Color.BLUE, Color.yellow, true);
                ship.SetPosition(rnd.nextInt(90)+10, rnd.nextInt(90)+10, Width, Height);                
				repaint();
			}
		});
		add(buttonCreateMotorShip);
		
		JButton buttonDown = new JButton("\u0412\u043D\u0438\u0437");
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ship!=null)
				ship.MoveTransport(Direction.Down);                                
				repaint();
			}
		});
		add(buttonDown);
		
		JButton buttonLeft = new JButton("\u0412\u043B\u0435\u0432\u043E");
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ship!=null)
				ship.MoveTransport(Direction.Left);
				repaint();
			}
		});
		add(buttonLeft);
		
		JButton buttonUp = new JButton("\u0412\u0432\u0435\u0440\u0445");
		buttonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ship!=null)
				ship.MoveTransport(Direction.Up);
				repaint();
			}
		});
		
		add(buttonUp);
	}
	
	public void paint(Graphics g) {
		super.paint(g);	
		if(ship!=null)    
		{
			ship.DrawTransport(g);
			deck = new CrossedDeck();
			deck.DrawDesign(Decks.one, g,  Color.black);
		}
                                       
			
	}
}
