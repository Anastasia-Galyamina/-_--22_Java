package ship1;

import java.awt.Color;
import java.awt.Graphics;

public class StrippedDeck implements IDeck{	
	
	public StrippedDeck (){};
	
	public void DrawDesign(Decks decks, Graphics g, Color color)
	{
		g.setColor(color);
		for(int i = 0; i < 90; i += 10)
		g.drawLine(i, 35, i, 50);
		switch (decks)
		{			
		case two:
			for(int i = 20; i < 70; i += 10)
			g.drawLine(i, 25, i, 35);			
		case three:		
			for(int i = 35; i < 55; i += 10)
			g.drawLine(i, 15, i, 25);			
					
		}
	}

}
