package cn.devunion.maze;

import cn.devunion.maze.common.Door;
import cn.devunion.maze.common.Room;
import cn.devunion.maze.common.Wall;

/**
 * <p>Description: 创建迷宫的类</p>
 * <p>@Date: 2021-11-17 14:41:45</p>
 * <p>@Author: 飞拳</p>
 */
public class MazeGame {

	public Maze createMaze(){
		Maze maze = new Maze();
		// 建立边界墙
		Wall wallEdge0 = new Wall();
		Wall wallEdge1 = new Wall();
		Wall wallEdge2 = new Wall();
		Wall wallEdge3 = new Wall();
		Wall wallEdge4 = new Wall();
		Wall wallEdge5 = new Wall();
		Wall wallEdge6 = new Wall();
		Wall wallEdge7 = new Wall();
		// 建立公共墙
		Wall wallPublic0 = new Wall();
		Wall wallPublic1 = new Wall();
		// 建立四个房间
		Room room0 = new Room(0);
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Room room3 = new Room(3);
		// 建立公共门
		Door door0 = new Door(Door.OPEN, room0, room1);
		Door door1 = new Door(Door.OPEN, room1, room3);

		room0.setSite(Direction.WEST, wallEdge0);
		room0.setSite(Direction.NORTH, wallEdge1);
		room0.setSite(Direction.EAST, door0);
		room0.setSite(Direction.SOUTH, wallPublic0);

		room1.setSite(Direction.WEST, door0);
		room1.setSite(Direction.NORTH, wallEdge2);
		room1.setSite(Direction.EAST, wallEdge3);
		room1.setSite(Direction.SOUTH, door1);

		room2.setSite(Direction.WEST, wallEdge7);
		room2.setSite(Direction.NORTH, wallPublic0);
		room2.setSite(Direction.EAST, wallPublic1);
		room2.setSite(Direction.SOUTH, wallEdge6);

		room3.setSite(Direction.WEST, wallPublic1);
		room3.setSite(Direction.NORTH, door1);
		room3.setSite(Direction.EAST, wallEdge4);
		room3.setSite(Direction.SOUTH, wallEdge5);

		maze.addRoom(room0);
		maze.addRoom(room1);
		maze.addRoom(room2);
		maze.addRoom(room3);
		return maze;
	}

}
