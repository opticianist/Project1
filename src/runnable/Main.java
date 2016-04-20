package runnable;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GCompound;
import visualization.Board;
import visualization.Bus;
import visualization.Car;
import visualization.Vehicle;

/*
 * 
 * mainclass,boarding ve car sýnýflarý kullanýlarak bir oyun hazýrlandý
 * 
 */
public class Main {
	
	
	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		/* Board yeniboard=new Board("New Game",866,1300);
		Vehicle bus=new Bus(100,100,10,1);
		vehicles.add(bus);
		
		for (int i=0; i<500; i++) {
		if(bus.getDirection()==0){
			bus.move(1, 0);
		}
		if(bus.getDirection()==1){
			bus.move(-1, 0);
		}
		
		yeniboard.add(bus);
		yeniboard.waitFor(50);
		}  */
		
		
		Board yeniboard=new Board("New Game",866,1300);
		int i=0;
		while(true & i<500){
		
		Random rand=new Random();
		int dnumber=rand.nextInt(2);
		int lnumber=rand.nextInt(6);
		
		double createNew =Math.random();
		if(createNew <0.01){
			Vehicle randomVehicle=new Car(lnumber*100,lnumber*100,lnumber,dnumber);
			
				vehicles.add(randomVehicle);
				yeniboard.addObject(randomVehicle);
			
			
			
			for(int a=0; a<vehicles.size();a++){
			if(vehicles.get(a).getDirection()==0){
				vehicles.get(a).move(1, 0);
			}
			if(vehicles.get(a).getDirection()==1){
				vehicles.get(a).move(-1, 0);
			}
			
			
			}
			
			
			
			
			
		}
		
		
		yeniboard.waitFor(50);
		
		i++;
		
		
		
		}
		
		// yeniboard.addGameInfoLabels();
		/*
		GCompound car1=new Car(100,100);
		yeniboard.add(car1);
		car1.sendToFront();
		
		GCompound car2=new Car(100,200);
		yeniboard.add(car2);
		car2.sendToFront();
		
		GCompound car3=new Car(500,300);
		yeniboard.add(car3);
		car3.sendToFront();
		
		GCompound car4=new Car(100,400);
		yeniboard.add(car4);
		car4.sendToFront();
	
		
		for (int i=0; i<500; i++) {
			car1.move(1, 0);
			car2.move(-1, 0);
			car3.move(1, 0);
			car4.move(-1, 0);
			yeniboard.waitFor(50);
		}  */
		
		
		
		// The main loop of the game
	
				while(true ){
					moveVehicles(vehicles);
					
					createVehicle();
					
					
					
					
					//TODO check for collision and call other methods like updateScore etc.
				}
			}

			/**
			 * Move each vehicle on the arraylist one step in their corresponding direction
			 * 
			 * @param veh	visible vehicles	
			 */
			private static void moveVehicles(ArrayList<Vehicle> veh) {
				
			}

			/**
			 * Create new vehicle checking the already created vehicles.
			 * Creation, type and lane of the vehicle are decided randomly.
			 * 
			 * Once the vehicle created, if the lane is not available (occupied with some other vehicle),
			 * the newly created one is discarded.
			 * 
			 * @return 		vehicle to be added to the board
			 */
			private static Vehicle createVehicle() {
				
				
			/*	Random rand=new Random();
				int dnumber=rand.nextInt(2);
				int lnumber=rand.nextInt(5);
				
				double createNew =Math.random();
				if(createNew <1.0){
					Vehicle randomVehicle=new Car(100,100,lnumber,dnumber);
					if(randomVehicle.getDirection()==0){
						randomVehicle.move(1, 0);
					}
					if(randomVehicle.getDirection()==1){
						randomVehicle.move(-1, 0);
					}
					
				
					
				}      */	
				
				return null;
			}
		
		
		
		
		
		
		
	}
	
	
	
