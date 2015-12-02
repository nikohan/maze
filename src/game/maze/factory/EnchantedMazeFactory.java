package game.maze.factory;

import game.maze.model.*;
import game.maze.model.enchanted.*;

public class EnchantedMazeFactory implements MazeFactory{

	public Room makeRoom(String no) {
		return new EnchantedRoom(no, castSpell());
	}
	
	public Door makeDoor(Room[] rooms) {
		return new DoorNeedingSpell(rooms);
	}

	protected Spell castSpell() {
		return new Spell();
	}
}
