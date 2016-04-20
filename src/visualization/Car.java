package visualization;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class Car extends Vehicle {
	
	int wheelCircle;
	int windowLength;
	int lane;
	int direction;
	public Car(int objX, int objY,int lane,int direction) {
		
		addBody(objX, objY);
		addWindows(objX, objY);
		addWheels(objX, objY);
		addLabel(objX, objY);
		this.lane=lane;
		this.direction=direction;
		
		this.wheelCircle=10;
		this.windowLength=10;
	}
	
	@Override
	public int getDirection(){
		return direction;
	}
	
	


	@Override
	public void addBody(int objX, int objY) {
		body = new GRect(100, 100);
		body.setFillColor(Color.YELLOW);
		body.setFilled(true); 
		add(body, objX, objY);
		
	}

	@Override
	public void addWindows(int objX, int objY) {
		windows=new GRect [2];
		
		for(int i=0;i<2;i++){
			windows[i]=new GRect(15,15);
			windows[i].setFillColor(Color.WHITE);
			windows[i].setFilled(true);
		}
		
		add(windows[0],objX+(width-2*this.windowLength)/3 +20, objY+this.windowLength+20 );
		add(windows[1],objX+this.windowLength + 2*(width-2*this.windowLength)/3 +60, objY+this.windowLength+20 );
		
	}

	@Override
	public void addWheels(int objX, int objY) {
		wheels = new GOval[2];
		for (int i=0; i<2; i++) {
			wheels[i] = new GOval(20,20);
			wheels[i].setFillColor(Color.RED);
			wheels[i].setFilled(true); 
		}
		add(wheels[0], objX+(width-2*this.wheelCircle)/3, objY+height+90);
		add(wheels[1], objX+this.wheelCircle+2*(width-2*this.wheelCircle)/3 +80, objY+height+90);
		
	}

	@Override
	public void addLabel(int objX, int objY) {
		label = new GLabel("TAKSÝ");
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setColor(Color.WHITE);
		add(label,objX+20,objY+60);
		
	}

}
