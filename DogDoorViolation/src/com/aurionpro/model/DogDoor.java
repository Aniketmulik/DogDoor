package com.aurionpro.model;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public void open() {
		System.out.println("The door opens\n");
		open=true;
	}
	
	public void close() {
		System.out.println("The door closes\n");
		open=false;
	}
}
/*This class represents the dog door itself.
 *  It has methods to open and close the door, as well as check whether the door
 *   is currently open. The open() and close() methods change the state of the door,
 *    and the isOpen() method is used to check the current state of the door.
 */