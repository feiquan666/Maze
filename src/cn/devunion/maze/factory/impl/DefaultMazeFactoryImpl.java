package cn.devunion.maze.factory.impl;

import cn.devunion.maze.Maze;
import cn.devunion.maze.common.Door;
import cn.devunion.maze.common.Room;
import cn.devunion.maze.common.Wall;
import cn.devunion.maze.factory.MazeFactory;

/**
 * <p>Description: MazeFactory 的默认实现</p>
 * <p>@Date: 2021-11-22 17:01:23</p>
 * <p>@Author: 飞拳</p>
 */
public class DefaultMazeFactoryImpl implements MazeFactory {

	@Override
	public Door makeDoor(boolean isOpen, Room room1, Room room2) {
		return new Door(isOpen, room1, room2);
	}

	@Override
	public Wall makeWall() {
		return new Wall();
	}

	@Override
	public Room makeRoom(int roomNo) {
		return new Room(roomNo);
	}

	@Override
	public Maze makeMaze() {
		return new Maze();
	}
}
