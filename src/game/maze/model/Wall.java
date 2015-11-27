package game.maze.model;

import game.maze.inter.MapSite;

public class Wall implements MapSite{

	public void enter() {
		System.out.println("你碰到了墙");
	}
}
