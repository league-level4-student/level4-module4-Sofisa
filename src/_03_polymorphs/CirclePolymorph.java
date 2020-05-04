package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	int counter = 0;
	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		//RedPolymorph redPoly = new RedPolymorph(10,10,10,10);
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		counter++;
		//System.out.println((int)(getX() + Math.cos(counter)*100.0));
		//System.out.println((int)(getX() + Math.sin(counter)*100.0));
		setX((int)(getX() + Math.cos(counter)*100));
		setY((int)(getY() + Math.sin(counter)*100));
	}
}
