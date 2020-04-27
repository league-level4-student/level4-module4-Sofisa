package _03_polymorphs;

import java.awt.Graphics;
import java.util.Random;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;
	Random randy = new Random();
//getter setter X
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

//getter setter Y
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
//getter setter width
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
//getter setter height
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void updateMove() {
		setX(randy.nextInt(150));
		setY(randy.nextInt(150));
	}

	public void update() {
		
	}

	public abstract void draw(Graphics g);
}
