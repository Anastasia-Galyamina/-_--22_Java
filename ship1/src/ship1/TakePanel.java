package ship1;

import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JPanel;

public class TakePanel extends JPanel {
	public ITransport transport;
	public IDeck deck;

 	public void SetTransport(ITransport transport, IDeck deck) {
		this.transport = transport;
		this.deck = deck; 		
 		
	}	
 	
	public void paint(Graphics g) {
		super.paint(g);
		if (transport != null) {			
			transport.DrawTransport(g);
			if (deck != null) {					
				deck.DrawDesign(Decks.two, g, Color.black);
			}
		}
	}
}

