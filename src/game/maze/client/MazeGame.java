package game.maze.client;

import game.maze.factory.BombedMazeFactory;
import game.maze.factory.EnchantedMazeFactory;
import game.maze.factory.MazeFactory;
import game.maze.model.Door;
import game.maze.model.Maze;
import game.maze.model.Room;
import game.maze.utils.Direction;

public class MazeGame {

	public static void main(String[] args) {
		MazeGame mazeGame = new MazeGame();
		MazeFactory factory = new EnchantedMazeFactory();
		MazeFactory factory1 = new BombedMazeFactory();
		Maze maze = mazeGame.createMaze(factory);
		Maze maze1 = mazeGame.createMaze(factory1);
	}
	
	public Maze createMaze(MazeFactory factory) {
		Maze mazes = factory.makeMaze();
		Room room1 = factory.makeRoom("001");
		Room room2 = factory.makeRoom("002");
		Room[] sideRoom = {room1, room2};

		Door door = factory.makeDoor(sideRoom);
		door.setOpen(true);
		
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.WEST, factory.makeWall());
		room1.setSide(Direction.SOUTH, factory.makeWall());
		room1.setSide(Direction.NORTH, factory.makeWall());
		
		room2.setSide(Direction.EAST, factory.makeWall());
		room2.setSide(Direction.WEST, door);
		room2.setSide(Direction.SOUTH, factory.makeWall());
		room2.setSide(Direction.NORTH, factory.makeWall());
		
		mazes.addRoom(room1);
		mazes.addRoom(room2);
		
		return mazes;
	}
}
