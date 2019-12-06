package ship1;

import java.awt.Color;
import java.awt.Graphics;

public class CrossedDeck implements IDeck{	
	
	public CrossedDeck (){};
		
	public void DrawDesign(Decks decks, Graphics g, Color color)
	{
		g.setColor(color);
		for(int i = 0; i < 90; i += 10)
			g.drawLine(i, 35, i, 50);
		for(int j = 35; j < 50; j += 10)
			g.drawLine(0, j, 90, j);
		switch (decks)
		{			
		case two:
			for(int i = 20; i < 70; i += 10)
				g.drawLine(i, 25, i, 35);	
			for(int j = 25; j < 35; j += 10)
				g.drawLine(20, j, 70, j);
		case three:		
			for(int i = 35; i < 55; i += 10)
				g.drawLine(i, 15, i, 25);	
			for(int j = 15; j < 25; j += 10)
				g.drawLine(35, j, 55, j);
					
		}
	}
}
