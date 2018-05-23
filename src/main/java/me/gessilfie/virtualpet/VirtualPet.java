package me.gessilfie.virtualpet;

public class VirtualPet {
	
	private String name;
	private int sleepy;
	private int hunger;
	private int boredom;
	private int thirsty;
	//constructor
	public VirtualPet(String n) {
		name = n;
		sleepy = 3;
		hunger = 3;
		boredom = 3;
		thirsty = 3;
	}
	//create getter methods
	
	public String getName() {
		return name;
	}	
	public int getSleepy() {
		return sleepy;
	}	
	public int getHunger() {
		return hunger;
	}	
	public int getBoredom() {
		return boredom;
	}
	public int getThirst() {
		return thirsty;
	}
	//create setter methods
	
	public void setSleepy(int s) {
		sleepy = s;
	}
	public void setHunger(int hgr) {
		hunger = hgr;
	}
	public void setBoredom(int b) {
		boredom = b;
	}
	public void setThirst(int t) {
		thirsty = t;
	}
	//utility methods to modify levels
	public void modifySleepy(int s) {
		sleepy += s;
	}
	public void modifyHunger(int hgr) {
		hunger += hgr;
	}
	public void modifyBoredom(int b) {
		boredom += b;
	}
	public void modifyThirst(int t) {
		thirsty += t;
	}
	//tick method to randomize game loop
	public void tick() {
		sleepy += 1;
		hunger += 1;
		boredom += 1;
		thirsty += 1;
	}
	
	

}