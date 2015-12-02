package game.maze.model.bomb;

import game.maze.model.Wall;

public class BombedWall extends Wall{

	private Bomb bomb;

	public Bomb getBomb() {
		return bomb;
	}

	public void setBomb(Bomb bomb) {
		this.bomb = bomb;
	}
}
