package cn.devunion.maze.common;

import cn.devunion.maze.MapSite;
import cn.devunion.maze.Player;

/**
 * <p>Description: 墙</p>
 * <p>@Date: 2021-11-17 11:13:06</p>
 * <p>@Author: 飞拳</p>
 */
public class Wall extends MapSite {
	@Override
	public String enter(Player player) {
		String msg = "这是一堵墙，您碰壁了";
		System.out.println(msg);
		return msg;
	}
}
