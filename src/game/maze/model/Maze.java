package game.maze.model;

import java.util.HashMap;
import java.util.Map;

public class Maze {

	private Map<String, Room> rooms = new HashMap<String, Room>();
	
	public void addRoom(Room room) {
		rooms.put(room.getId(), room);
	}
	
	public Room getRoom(String no) {
		return rooms.get(no);
	}
}
