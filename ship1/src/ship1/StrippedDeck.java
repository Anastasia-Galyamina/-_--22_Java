package ship1;

import java.awt.Color;
import java.awt.Graphics;

public class StrippedDeck implements IDeck{	
	int startPosX;
	int startPosY;	
	
	public void SetPosition(int X, int Y)
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
			for(int i = 0; i < 200; i += 5)
		g.drawLine(startPosX + i, startPosY + 50, startPosX + i, startPosY + 80);
			for(int i =  50; i <  150; i += 5)
			g.drawLine(startPosX + i, startPosY + 30, startPosX + i, startPosY + 50);
			break;
		case three:		
			for(int i = 30; i <  60; i += 5)
			g.drawLine(startPosX + i, startPosY + 15, startPosX +i, startPosY +25);	
			break;
		}
	}

}
