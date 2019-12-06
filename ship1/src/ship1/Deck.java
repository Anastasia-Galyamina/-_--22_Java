package ship1;

import java.awt.Color;
import java.awt.Graphics;

public class Deck {
	Decks decks;
	int y;
	
	public Deck(Decks deck)
	{
		decks = deck;
	}
	
	public void DrawDecks(Graphics g, int x, int y, Color MainColor, Color SecondColor, Color ThirdColor)
	{	
		g.setColor(MainColor);
		g.fillRect(x, y + 35, 90, 15);
		this.y = 20;
		switch (decks)
		{
		case two:
			g.setColor(SecondColor);
			g.fillRect(x +20, y + 25, 50, 10);
			this.y = 10;
		case three:			
			g.fillRect(x  +20, y + 25, 50, 10);
			g.setColor(ThirdColor);
			g.fillRect(x + 35, y + 15, 20, 10);
			this.y = 0;			
		}
	}
}
