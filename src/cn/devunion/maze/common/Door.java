package cn.devunion.maze.common;

import cn.devunion.maze.MapSite;
import cn.devunion.maze.Player;

/**
 * <p>Description: 门</p>
 * <p>@Date: 2021-11-17 11:57:30</p>
 * <p>@Author: 飞拳</p>
 */
public class Door extends MapSite {

	public static final boolean OPEN = Boolean.TRUE;
	public static final boolean CLOSE = Boolean.FALSE;

	private Boolean isOpen;
	private final Room room1;
	private final Room room2;

	public Door(boolean isOpen, Room room1, Room room2) {
		this.isOpen = isOpen;
		this.room1 = room1;
		this.room2 = room2;
	}

	@Override
	public String enter(Player player) {
		String msg = "门是关的，你碰壁了";
		if (isOpen) {
			Room position = player.getPosition();
			Room nextRoom = otherSideFrom(position);
			msg = "您即将进入[" + nextRoom.getRoomNo() + "]号房间";
			System.out.println(msg);
			nextRoom.enter(player);
			return msg;
		}
		return msg;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	private Room otherSideFrom(Room room) {
		if (room == room1) {
			return room2;
		}
		return room1;
	}
}
