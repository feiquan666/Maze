package cn.devunion.maze;

import cn.devunion.maze.common.Door;
import cn.devunion.maze.common.Room;
import cn.devunion.maze.common.Wall;
import cn.devunion.maze.factory.MazeFactory;

/**
 * <p>Description: 创建迷宫的类</p>
 * <p>@Date: 2021-11-17 14:41:45</p>
 * <p>@Author: 飞拳</p>
 */
public class MazeGame {

	public Maze createMaze(MazeFactory mazeFactory) {
		Maze maze = mazeFactory.makeMaze();
		// 建立边界墙
		Wall wallEdge0 = mazeFactory.makeWall();
		Wall wallEdge1 = mazeFactory.makeWall();
		Wall wallEdge2 = mazeFactory.makeWall();
		Wall wallEdge3 = mazeFactory.makeWall();
		Wall wallEdge4 = mazeFactory.makeWall();
		Wall wallEdge5 = mazeFactory.makeWall();
		Wall wallEdge6 = mazeFactory.makeWall();
		Wall wallEdge7 = mazeFactory.makeWall();
		// 建立公共墙
		Wall wallPublic0 = mazeFactory.makeWall();
		Wall wallPublic1 = mazeFactory.makeWall();
		// 建立四个房间
		Room room0 = mazeFactory.makeRoom(0);
		Room room1 = mazeFactory.makeRoom(1);
		Room room2 = mazeFactory.makeRoom(2);
		Room room3 = mazeFactory.makeRoom(3);
		// 建立公共门
		Door door0 = mazeFactory.makeDoor(Door.OPEN, room0, room1);
		Door door1 = mazeFactory.makeDoor(Door.OPEN, room1, room3);

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
