package game.maze.model;

import game.maze.inter.MapSite;

public class Door implements MapSite{

	private Room[] sideRoom = new Room[2];
	
	private boolean isOpen;
	
	
	public Door(Room[] twoRoom) {
		this.sideRoom = twoRoom;
	}
	
	public Room otherSideRoom(Room room) {
		if(room.getId() == sideRoom[0].getId()) {
			return sideRoom[1];
		} else {
			return sideRoom[0];
		}
	} 
	
	public void enter() {
		
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
