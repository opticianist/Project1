package visualization;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import acm.graphics.GCanvas;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.graphics.GTurtle;

public class Board implements BoardIntf {
	
	JFrame frame;
	GCanvas kanvas;
	int genis;
	int yuksek;
	GImage arkaplan;
	GImage turtle;
	
	public static final String BACKGROUND_IMAGE="visualization/asfalt.jpg";
	public static final String TURTLE_IMAGE="visualization/turtle.png";
	
	private ArrayList<GObject> objects = new ArrayList<GObject>();
	
	public Board (String boardName, int width, int height) {
		frame = new JFrame(boardName);
		frame.setSize(width, height);
		this.genis=width;
		this.yuksek=height;
		 kanvas=new GCanvas();
		
		 frame.getContentPane().add(kanvas);
		
		setBackground(); 
		
		addKeyBoardListener();
		addGameInfoLabels();
		addTurtle();
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
	}
	
	
	public void addKeyBoardListener() {
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent event) {
				int keyCode = event.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					turtle.move(0, -5);
				} else if (keyCode == KeyEvent.VK_DOWN) {
					turtle.move(0, 5);
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					turtle.move(5, 0);
				} else if (keyCode == KeyEvent.VK_LEFT) {
					turtle.move(-5, 0);
				}
			}
		});
	}
	
	
	
	
	public void add(GObject g){
		
		kanvas.add(g);
	}
	
	
	public void setBackground() {
		arkaplan=new GImage(BACKGROUND_IMAGE);
		kanvas.add(arkaplan);
		arkaplan.sendBackward();
		
	}
	
	
	public void addTurtle(){
		 turtle=new GImage(TURTLE_IMAGE);
		turtle.setSize(90,90);
		turtle.setLocation(frame.getWidth()/2 ,frame.getHeight()/2 + 100);
		kanvas.add(turtle);
		turtle.setVisible(true);
		turtle.sendForward();
		
		
	}
	
	public void addObject(GObject g) {
		kanvas.add(g);
		objects.add(g);
		System.out.println("added");
		turtle.sendToFront();
	}
	
	
	public void waitFor(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void setCanvas(String boardName, int width, int height) {
	
		
	}


	@Override
	public void addGameInfoLabels() {
		GRect alt=new GRect(850 ,100);
		alt.setLocation( 10,710);
		alt.setColor(Color.GRAY);
		alt.sendToFront();
		alt.setFillColor(Color.WHITE);
		alt.setFilled(true);
		kanvas.add(alt);
		
		
		
		
		GLabel label1=new GLabel("Skor: ");
		kanvas.add(label1);
		label1.setLocation(20,730);
		label1.setColor(Color.BLACK);
		label1.setFont("SansSerif-bold-20");
		// label1.setFont("Arial");
		label1.sendForward();
		
		GLabel label2=new GLabel("Round : " );
		kanvas.add(label2);
		label2.setLocation(20,760);
		label2.setColor(Color.BLACK);
		label2.setFont("SansSerif-bold-20");
		label2.sendForward();
		
	}


	
/*
	public int getWidth(){
		
		return genis;
	}
	public int getHeight(){
		
		return yuksek;
	}
	*/
	
}