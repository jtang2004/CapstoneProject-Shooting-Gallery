import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

public abstract class Target {
	public static int sizeOfTarget;
	public static int points;
	public static Color colorOfTarget;
	static Random rand= new Random();
	public static int xLocation=rand.nextInt(700);
	public static int yLocation=rand.nextInt(500);
	
	public Target(int size, Color color, int pointValue) {
		sizeOfTarget = size;
		points = pointValue;
		colorOfTarget = color;

	}
	public int getSize() {
		return sizeOfTarget;
	}
	public int getPointValue() {
		return points;
	}
	public Color getColor() {
		return colorOfTarget;
	}
	public void draw(Graphics g) {

		g.fillOval(xLocation,yLocation, sizeOfTarget, sizeOfTarget);
	}

}
