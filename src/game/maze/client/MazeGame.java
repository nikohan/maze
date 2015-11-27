package game.maze.client;

import game.maze.model.*;
import game.maze.utils.Direction;

public class MazeGame {

	public static void main(String[] args) {
		MazeGame mazeGame = new MazeGame();
		Maze maze = mazeGame.createMaze();
		System.out.println(
				((Door)maze.getRoom("001")
					.getSide(Direction.EAST))
					.otherSideRoom(
							maze.getRoom("001"))
							);
	}
	
	public Maze createMaze() {
		Maze mazes = new Maze();
		Room room1 = new Room("001");
		Room room2 = new Room("002");
		Room[] sideRoom = {room1, room2};

		Door door = new Door(sideRoom);
		door.setOpen(true);
		
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.WEST, new Wall());
		room1.setSide(Direction.SOUTH, new Wall());
		room1.setSide(Direction.NORTH, new Wall());
		
		room2.setSide(Direction.EAST, new Wall());
		room2.setSide(Direction.WEST, door);
		room2.setSide(Direction.SOUTH, new Wall());
		room2.setSide(Direction.NORTH, new Wall());
		
		mazes.addRoom(room1);
		mazes.addRoom(room2);
		
		return mazes;
	}
}
