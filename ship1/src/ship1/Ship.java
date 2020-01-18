package ship1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ship extends Vehicle{
	
	private int shipWidth  = 220;    
    private int shipHeight = 200; 
    public Color FirstColor; 
    public Color SecondColor; 
    public int Weight;  
    IDeck deck;
    
    public Ship(int maxSpeed, int weight, Color firstColor, Color secondColor)
    {
        MaxSpeed = maxSpeed;
        Weight = weight;
        FirstColor = firstColor;   
        SecondColor = secondColor;    
    } 
    @Override
    public void MoveTransport(Direction direction)
    {
        float step = MaxSpeed * 100 / Weight;
        switch (direction)
        {           
            case Right:
                if (startPosX + step < pictureWidth - shipWidth)
                {
                    startPosX += step;
                }
                break;           
            case Left:
                if (startPosX - step > 0)                        
                {
                    startPosX -= step;
                }
                break;           
            case Up:
                if (startPosY - step > 0)
                {
                    startPosY -= step;
                }
                break;          
            case Down:
                if (startPosY + step < pictureHeight - shipHeight)
                {
                    startPosY += step;
                }
                break;
        }
    }
    public void GetRandom()
    {
        Random rnd = new Random();           
        switch(rnd.nextInt(3)+1) {
			case 3:
				deck= new BasicDeck();
				break;
			case 2:
				deck= new StrippedDeck();
				break;
			case 1:
				deck= new CrossedDeck();
				break;		
		}    	   
     }
    
    @Override
    public void DrawTransport(Graphics g)
	{	    	
		g.setColor(FirstColor);
		g.fillRect(startPosX, startPosY + 50, 200, 30); 
		g.setColor(SecondColor);
		g.fillRect(startPosX +50, startPosY + 30, 100, 20);		
		
	}    
}
