package game.maze.model;

import game.maze.inter.MapSite;
import game.maze.utils.Direction;



public class Room implements MapSite{
	/**
	 * 存放房间的四个方向的组件引用
	 */
	private MapSite[] sides = new MapSite[4];
	
	private String id;

	public Room(String no) {
		id = no;
	}
	
	public MapSite getSide(Direction d) {
		return sides[d.ordinal()];
	}
	
	public void setSide(Direction d, MapSite side) {
		sides[d.ordinal()] = side;
	}
	
	public void enter() {
		System.out.println("你进了" + id + "号房间");
	}

	public String getId() {
		return id;
	}

	public void setRoomNumber(String id) {
		this.id = id;
	}

}
