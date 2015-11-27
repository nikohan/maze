package game.maze.inter;

import game.maze.model.Room;

/**
 * 定义了迷宫中构件之间的主要关系
 * @author 标准账户
 *
 */
public interface MapSite {

	/**
	 * Enter为更加复杂的游戏操作提供了一个简单基础。例如，如果你在一个房间中说“向东走”，
	 * 游戏只能确定直接在东边的是哪一个 MapSite并对它调用Enter。特定子类的 
	 * Enter操作将计算出你的位置是发生改变，还是你会碰壁。在一个真正的游戏中， Enter
	 * 可以将移动的游戏者对象作为一个参数。
	 */
	public void enter();
}
