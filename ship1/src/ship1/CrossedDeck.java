package ship1;

import java.awt.Color;
import java.awt.Graphics;

public class CrossedDeck implements IDeck{	
	int startPosX;
	int startPosY;	
	
	public void SetPosition(int X, int Y)
	{
		startPosX = X;
		startPosY = Y;
	}	
		
	public void DrawDesign(Decks decks, Graphics g, Color color)
	{
		g.setColor(color);		
		switch (decks)
		{			
		case two:
			for(int i = 0; i < 200; i += 5)
				g.drawLine(startPosX + i, startPosY + 50, startPosX + i, startPosY + 80);
			for(int j = 50; j < 81; j += 5)
				g.drawLine(startPosX ,startPosY +  j, startPosX + 200, startPosY + j);
			for(int i = 50; i <  150; i += 5)
				g.drawLine(startPosX + i,startPosY +  30,startPosX +  i, startPosY + 50);	
			for(int j = 30; j < 51; j += 5)
				g.drawLine(startPosX + 50, startPosY + j, startPosX + 150, startPosY + j);
			break;
		case three:
			for(int i =  30; i <  60; i += 5)
				g.drawLine(startPosX + i, startPosY + 15, startPosX + i, startPosY + 25);	
			for(int j = 15; j < 25; j += 5)
				g.drawLine(startPosX + 35,startPosY +  j, startPosX + 55, startPosY + j);
			break;
					
		}
	}
}
