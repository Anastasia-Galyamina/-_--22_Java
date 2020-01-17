package ship1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle implements ITransport {
		
	protected int startPosX;    
	protected int startPosY;  
	protected int pictureWidth;    
	protected int pictureHeight; 
	Decks enumDeck = null;
    protected int MaxSpeed;   
	@Override
	public void SetPosition(int x, int y, int width, int height)
    {
        startPosX = x;
        startPosY = y;
        pictureWidth = width;
        pictureHeight = height;
    }   
	public abstract void MoveTransport(Direction direction);
	public abstract void DrawTransport(Graphics g);
}