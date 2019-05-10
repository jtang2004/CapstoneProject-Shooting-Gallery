import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.*;
import java.util.Random;
import java.util.TimerTask;

public class Gallery extends JPanel implements MouseListener, MouseMotionListener, ActionListener{
	private JButton StartButton;
	int x,y;
	boolean motion = false;
	boolean start = true;
	public int pointsGained = 0;


	public Gallery() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);

	}




	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		e.getX();
		e.getY();


	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		BasicTarget z= new BasicTarget();
		if(motion) {
			g.setColor(Color.CYAN);
			g.drawOval(x-10,y-10,20,20);
			g.drawLine (x,y-10,x,y+10);
			g.drawLine (x-10,y,x+10,y);
		}

		if(start) {
			g.setColor(Target.colorOfTarget);
			z.draw(g);
			//a.draw(g);
			Font f1 = new Font ("Serif", Font.BOLD, 30);
			g.setFont(f1); 
			g.setColor(Color.BLACK);
			g.drawString(pointsGained + "", 20, 25);
		}
	}







	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub 

	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(Target.xLocation+","+Target.yLocation);
		System.out.println("Mouse:"+e.getXOnScreen()+","+e.getYOnScreen());
		if(((Target.xLocation < e.getX())&&(Target.xLocation + Target.sizeOfTarget > e.getX()))&&((Target.yLocation < e.getY())&&(Target.yLocation + Target.sizeOfTarget > e.getY()))) {
			pointsGained += Target.points;
			Random rand = new Random();
			Target.xLocation = rand.nextInt(700);
			Target.yLocation = rand.nextInt(500);
			Target.sizeOfTarget -= 5;
			repaint();
			System.out.println(Target.xLocation + "," + Target.yLocation);

		}
		else {
			pointsGained = pointsGained - Target.points / 2;
			Random rand = new Random();
			Target.xLocation = rand.nextInt(700);
			Target.yLocation = rand.nextInt(500);
			Target.sizeOfTarget -= 5;
			repaint();
			System.out.println(Target.xLocation + "," + Target.yLocation);
		}

	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}



	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub


	}




	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		motion=true;





		repaint();


	}




	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		repaint();
	}







}
