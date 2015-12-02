package game.maze.model.bomb;

import game.maze.model.Room;

public class BombedRoom extends Room{

	private Bomb bomb;
	
	public Bomb getBomb() {
		return bomb;
	}

	public void setBomb(Bomb bomb) {
		this.bomb = bomb;
	}

	public BombedRoom(String no, Bomb bomb) {
		super(no);
		this.bomb = bomb;
	}

}
