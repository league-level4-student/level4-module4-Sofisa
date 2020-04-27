package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	Random randy = new Random();

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		//RedPolymorph redPoly = new RedPolymorph(10,10,10,10);
		g.setColor(Color.gray);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void updateMove() {
		setX(randy.nextInt(150));
		setY(randy.nextInt(150));
	}
}
