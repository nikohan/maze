package game.maze.model.enchanted;

import game.maze.model.Door;
import game.maze.model.Room;

public class DoorNeedingSpell extends Door{

	private Spell spell;
	
	public DoorNeedingSpell(Room[] twoRoom) {
		super(twoRoom);
	}

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

}
