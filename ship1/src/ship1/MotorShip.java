package ship1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MotorShip extends Ship {       
    public boolean Tube;    
    public Color ThirdColor;
                
    public MotorShip(int maxSpeed, int weight, Color firstColor, Color secondColor, Color thirdColor, boolean tube)
    {
        super(maxSpeed, weight, firstColor, secondColor); 
        ThirdColor = thirdColor;
        Tube = tube;
    }
   
   public void DrawTube(Graphics g)
   {
       g.setColor(Color.RED);
       g.fillRect(startPosX + 100, startPosY + 10, 10, 10);
   }          
   @Override
   public void DrawTransport(Graphics g)
   {
	   super.DrawTransport(g); 
	   g.setColor(ThirdColor);
	   g.fillRect(startPosX + 75, startPosY + 20, 50, 10);
	   if(Tube == true)
		   DrawTube(g);	   
    }
}
