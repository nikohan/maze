package game.maze.factory;

import game.maze.model.*;

public interface MazeFactory {

	
	public default Maze makeMaze() {
		return new Maze();
	}
	
	public default Wall makeWall() {
		return new Wall();
	}
	
	public default Room makeRoom(String no) {
		return new Room(no);
	}
	
	public default Door makeDoor(Room[] rooms) {
		return new Door(rooms);
	}
}
