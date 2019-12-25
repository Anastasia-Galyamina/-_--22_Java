package ship1;

import java.awt.Color;
import java.awt.Graphics;

public class BasicDeck implements IDeck{
	int startPosX;
	int startPosY;
	
	public BasicDeck (int X, int Y)
	{
		startPosX = X;
		startPosY = Y;
	};
	
	public void DrawDesign(Decks decks, Graphics g, Color color){};
	

}
