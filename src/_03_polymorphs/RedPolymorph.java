package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph {

	RedPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		//RedPolymorph redPoly = new RedPolymorph(10,10,10,10);
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
