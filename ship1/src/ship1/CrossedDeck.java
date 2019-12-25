package ship1;

import java.awt.Color;
import java.awt.Graphics;

public class CrossedDeck implements IDeck{	
	int startPosX;
	int startPosY;
	
	public CrossedDeck (int X, int Y)
	{
		startPosX = X;
		startPosY = Y;
	};
		
	public void DrawDesign(Decks decks, Graphics g, Color color)
	{
		g.setColor(color);		
		switch (decks)
		{			
		case two:
			for(int i = 0; i < 90; i += 5)
			g.drawLine(startPosX + i, startPosY + 35, startPosX + i, startPosY + 50);
		for(int j = 35; j < 55; j += 5)
			g.drawLine(startPosX ,startPosY +  j, startPosX + 90, startPosY + j);
			for(int i = 20; i <  70; i += 5)
				g.drawLine(startPosX + i,startPosY +  25,startPosX +  i, startPosY + 35);	
			for(int j = 25; j < 35; j += 5)
				g.drawLine(startPosX + 20, startPosY + j, startPosX + 70, startPosY + j);
			break;
		case three:		
			/*for(int i = 20; i <  70; i += 5)
				g.drawLine(startPosX + i,startPosY +  25,startPosX +  i, startPosY + 35);	
			for(int j = 25; j < 35; j += 5)
				g.drawLine(startPosX + 20, startPosY + j, startPosX + 70, startPosY + j);*/
			for(int i =  30; i <  60; i += 5)
				g.drawLine(startPosX + i, startPosY + 15, startPosX + i, startPosY + 25);	
			for(int j = 15; j < 25; j += 5)
				g.drawLine(startPosX + 35,startPosY +  j, startPosX + 55, startPosY + j);
			break;
					
		}
	}
}
