package cn.devunion.maze;

import cn.devunion.maze.common.Room;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: 表示房间集合的 Maze</p>
 * <p>@Date: 2021-11-17 14:22:43</p>
 * <p>@Author: 飞拳</p>
 */
public class Maze {

	/**
	 * <p>使用 Map 存储，方便查找房间</p>
	 */
	private final Map<Integer, Room> ROOM_MAP = new HashMap<>();

	public void addRoom(Room room){
		ROOM_MAP.put(room.getRoomNo(), room);
	}

	public Room getRoom(int roomNumber) {
		return ROOM_MAP.get(roomNumber);
	}

}
