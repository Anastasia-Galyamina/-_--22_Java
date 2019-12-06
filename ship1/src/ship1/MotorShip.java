package ship1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MotorShip {
	
    private int startPosX;    
    private int startPosY;    
    private int pictureWidth;    
    private int pictureHeight ;    
    private int carWidth  = 110;    
    private int carHeight = 100;    
    public boolean Tube; 
    public int MaxSpeed;    
    public int Weight;     
    public Color MainColor;    
    public Color SecondColor;
    public Color ThirdColor;
    Decks enumDeck = null;    
    
    public MotorShip(int maxSpeed, int weight, Color mainColor, Color secondColor, Color thirdColor, boolean tube)
    {
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
        SecondColor = secondColor;
        ThirdColor = thirdColor;
        Tube = tube;
    }
   public void SetPosition(int x, int y, int width, int height)
    {
        startPosX = x;
        startPosY = y;
        pictureWidth = width;
        pictureHeight = height;
    }   
   public void DrawTube(Graphics g, int x, int y)
   {
       g.setColor(Color.RED);
       g.fillRect(x, y, 10, 15);
   }

   public void MoveTransport(Direction direction)
   {
       float step = MaxSpeed * 100 / Weight;
       switch (direction)
       {           
           case Right:
               if (startPosX + step < pictureWidth - carWidth)
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
               if (startPosY + step < pictureHeight - carHeight)
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
				enumDeck=enumDeck.three;
				break;
			case 2:
				enumDeck=enumDeck.two;
				break;
			case 1:
				enumDeck=enumDeck.one;
				break;		
			}    	   
       }  
   
       public void DrawShip(Graphics g)
       {
    	   Deck deck = new Deck(enumDeck);
    	   deck.DrawDecks( g, startPosX, startPosY, MainColor, SecondColor, ThirdColor);
    	   
    	   if(Tube == true)
    		   DrawTube(g, startPosX+40, startPosY+deck.y);
       }
   }


