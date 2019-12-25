package ship1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ship extends Vehicle{
	
	private int shipWidth  = 110;    
    private int shipHeight = 100; 
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
    protected void GetRandom()
    {
        Random rnd = new Random();           
        switch(rnd.nextInt(3)+1) {
			case 3:
				deck= new BasicDeck(startPosX, startPosY);
				break;
			case 2:
				deck= new StrippedDeck(startPosX, startPosY);
				break;
			case 1:
				deck= new CrossedDeck(startPosX, startPosY);
				break;		
		}    	   
     }
    
    @Override
    public void DrawTransport(Graphics g)
	{	    	
		g.setColor(FirstColor);
		g.fillRect(startPosX, startPosY + 35, 90, 15); 
		g.setColor(SecondColor);
		g.fillRect(startPosX +20, startPosY + 25, 50, 10);
		GetRandom();
   		deck.DrawDesign(Decks.two, g,  Color.black);
		
	}
    
    

}
