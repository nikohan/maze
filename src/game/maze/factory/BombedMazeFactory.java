package game.maze.factory;

import game.maze.model.*;
import game.maze.model.bomb.*;

public class BombedMazeFactory implements MazeFactory{

	public Room makeRoom(String no) {
		return new BombedRoom(no, meetBomb());
	}
	
	public Wall makeWall() {
		return new BombedWall();
	}

	private Bomb meetBomb() {
		return new Bomb();
	}
}
