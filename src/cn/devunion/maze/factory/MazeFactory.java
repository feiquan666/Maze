package cn.devunion.maze.factory;

import cn.devunion.maze.Maze;
import cn.devunion.maze.common.Door;
import cn.devunion.maze.common.Room;
import cn.devunion.maze.common.Wall;

/**
 * <p>Description: 迷宫抽象工厂</p>
 * <p>@Date: 2021-11-22 16:47:48</p>
 * <p>@Author: 飞拳</p>
 */
public interface MazeFactory {

	/**
	 * <p>description: 创建一扇门，可以指定开关状态</p>
	 * @param room1 连接的房间
	 * @param room2 连接的另一个房间
	 * @param isOpen 是否打开
	 * @return {@linkplain Door}
	 * @Date: 2021-11-22 16:53:37
	 * @Author: 飞拳
	 */
	Door makeDoor(boolean isOpen, Room room1, Room room2);

	/**
	 * <p>description: 创建一堵墙</p>
	 * @return {@linkplain Wall}
	 * @Date: 2021-11-22 16:56:08
	 * @Author: 飞拳
	 */
	Wall makeWall();

	/**
	 * <p>description: 创建房间</p>
	 * @param roomNo 房间编号
	 * @return {@linkplain }
	 * @Date: 2021-11-22 16:59:12
	 * @Author: 飞拳
	 */
	Room makeRoom(int roomNo);

	/**
	 * <p>description: 创建迷宫</p>
	 * @return {@linkplain Maze}
	 * @Date: 2021-11-22 16:59:45
	 * @Author: 飞拳
	 */
	Maze makeMaze();

}
