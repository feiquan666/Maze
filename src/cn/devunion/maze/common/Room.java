package cn.devunion.maze.common;

import cn.devunion.maze.Direction;
import cn.devunion.maze.MapSite;
import cn.devunion.maze.Player;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: Room</p>
 * <p>@Date: 2021-11-17 11:13:25</p>
 * <p>@Author: 飞拳</p>
 */
public class Room extends MapSite {

	private final Map<Direction, MapSite> siteMap;
	private final Integer roomNo;

	public Room(int roomNo) {
		this.roomNo = roomNo;
		siteMap = new HashMap<>();
	}

	@Override
	public String enter(Player player) {
		// 改变玩家位置
		player.setPosition(this);
		String msg = "欢迎来到[" + this.roomNo + "]号房间";
		System.out.println(msg);
		return msg;
	}

	public void setSite(Direction direction, MapSite site) {
		siteMap.put(direction, site);
	}

	public MapSite getSite(Direction direction) {
		return siteMap.get(direction);
	}

	public Integer getRoomNo() {
		return roomNo;
	}
}
