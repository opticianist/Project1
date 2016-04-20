package visualization;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class Bus extends Vehicle {
	
	int wheelCircle;
	int windowLength;
	int lane;
	int direction;
	public Bus(int objX, int objY,int lane,int direction) {
		
		addBody(objX, objY);
		addWindows(objX, objY);
		addWheels(objX, objY);
		addLabel(objX, objY);
		this.lane=lane;
		this.direction=direction;
		
		this.wheelCircle=20;
		this.windowLength=20;
	}
	

	@Override
	public void addBody(int objX, int objY) {
		body = new GRect(150, 100);
		body.setFillColor(Color.RED);
		body.setFilled(true); 
		add(body, objX, objY);
		
	}

	@Override
	public void addWindows(int objX, int objY) {
		windows=new GRect [2];
		
		for(int i=0;i<2;i++){
			windows[i]=new GRect(20,20);
			windows[i].setFillColor(Color.WHITE);
			windows[i].setFilled(true);
		}
		
		add(windows[0],objX+(width-2*this.windowLength)/3 +30, objY+this.windowLength+20 );
		add(windows[1],objX+this.windowLength + 2*(width-2*this.windowLength)/3 +100, objY+this.windowLength+20 );
		
	}

	@Override
	public void addWheels(int objX, int objY) {
		wheels = new GOval[2];
		for (int i=0; i<2; i++) {
			wheels[i] = new GOval(20,20);
			wheels[i].setFillColor(Color.BLUE);
			wheels[i].setFilled(true); 
		}
		add(wheels[0], objX+(width-2*this.wheelCircle)/3, objY+height+90);
		add(wheels[1], objX+this.wheelCircle+2*(width-2*this.wheelCircle)/3 +130, objY+height+90);
		
	}

	@Override
	public void addLabel(int objX, int objY) {
		label = new GLabel("BUS");
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setColor(Color.WHITE);
		add(label,objX+55,objY+65);
		
	}
	
		

}
