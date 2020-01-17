package ship1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Parking <T extends ITransport, D extends IDeck>   
{
	private T[] places;
	private D[] placesDecks;
	private int PictureWidth;
	private int PictureHeight;
	private final int placeSizeWidth = 220;
	private final int placeSizeHeight = 90;	
	
	@SuppressWarnings("unchecked")
	public Parking(int size, int pictureWidth, int pictureHeight) {
		this.places = (T[]) new ITransport[size];
		this.placesDecks = (D[]) new IDeck[size];
		PictureWidth = pictureWidth;
		PictureHeight = pictureHeight;
		for (int i = 0; i < places.length; i++)
		{
			places[i] = null;
			placesDecks[i] = null;
		}
	}	
	
	public int addShip(T ship, D deck) {
		for (int i = 0; i < places.length; i++)
		{
			if (this.CheckFreePlace(i))
			{
				places[i] = ship;
				places[i].SetPosition(5 + i / 5 * placeSizeWidth, i % 5 * placeSizeHeight , PictureWidth, PictureHeight);
				placesDecks[i] = deck;	
				placesDecks[i].SetPosition(5 + i / 5 * placeSizeWidth, i % 5 * placeSizeHeight);
				return i;
			}       	
		}

 		return -1;
	}
	
	public T deleteShip(int index) {
		if (index < 0 || index > places.length)
		{
			return null;
		}
		if (!this.CheckFreePlace(index))
		{
			T ship = places[index];
			places[index] = null;
			placesDecks[index] = null;
			return ship;
		}
		return null;
	}
	
	public boolean CheckFreePlace(int index) {
		return places[index]==null;
	}
	public void Draw(Graphics g) {
		drawMarking(g);
		for (int i = 0; i < places.length; i++) {
			if(!CheckFreePlace(i)) {				
				places[i].DrawTransport(g);				
				placesDecks[i].DrawDesign(Decks.two, g, Color.black);
			}	
		}
	}
	private void drawMarking(Graphics g) {
		g.drawRect(0, 0, (places.length/5)*placeSizeWidth,480);
		for (int i = 0; i < places.length/5; i++) {
			for (int j = 0; j < 6; j++) {
				g.drawLine(i*placeSizeWidth, j*placeSizeHeight, i*placeSizeWidth+110, j*placeSizeHeight);
			}
			g.drawLine(i*placeSizeWidth, 0, i*placeSizeWidth, 450);
		}
	}
	public T checkTransportAtIndex(int index) {
		return places[index];	
	}
	public D checkDecksAtIndex(int index) {
		return placesDecks[index];	
	}
	public int getSize() {
		return places.length;
	}	
	
}
