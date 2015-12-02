package game.maze.model.enchanted;

import game.maze.model.Room;

public class EnchantedRoom extends Room{

	/**
	 * 咒语
	 */
	private Spell spell;
	
	public EnchantedRoom(String no, Spell spell) {
		super(no);
		spell.setMessage("1234");
	}

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

}
