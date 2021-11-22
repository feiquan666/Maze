package cn.devunion.maze;

import cn.devunion.maze.common.Room;
import cn.devunion.maze.factory.MazeFactory;
import cn.devunion.maze.factory.impl.DefaultMazeFactoryImpl;

/**
 * <p>Description: 玩家</p>
 * <p>@Date: 2021-11-17 11:50:23</p>
 * <p>@Author: 飞拳</p>
 */
public class Player {

	/**
	 * <p>玩家位置</p>
	 */
	private Room position;

	private Direction direction;

	public Player(MazeGame mazeGame, int roomNo, Direction direction){
		MazeFactory mazeFactory = new DefaultMazeFactoryImpl();
		Maze maze = mazeGame.createMaze(mazeFactory);
		// 设置房间 => 0
		this.position = maze.getRoom(roomNo);
		// 设定指向 => 东
		this.direction = direction;
	}

	public Room getPosition() {
		return position;
	}

	public void setPosition(Room position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return String.format("所处房间：%s 号，指向：%s", position.getRoomNo(), direction.name());
	}

	public void go(Direction direction) {
		if (null != direction) {
			this.direction = direction;
		}
		System.out.println("玩之前：" + this);
		// 获取房间
		Room room = this.position;
		// 获取指向的操作
		MapSite site = room.getSite(this.direction);
		// 执行操作
		site.enter(this);
		System.out.println("玩之后：" + this + "\n");
	}
}
