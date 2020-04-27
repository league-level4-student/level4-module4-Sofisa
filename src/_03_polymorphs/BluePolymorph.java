package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	
	}

	@Override
	public void draw(Graphics g) {
		//BluePolymorph bluePoly = new BluePolymorph(10,10,10,10);
		
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}
