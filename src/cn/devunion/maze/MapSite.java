package cn.devunion.maze;

/**
 * <p>Description: 抽象类</p>
 * <p>@Date: 2021-11-17 11:10:48</p>
 * <p>@Author: 飞拳</p>
 */
public abstract class MapSite {

	/**
	 * <p>description: 进入某组件的方法</p>
	 * @param player 玩家
	 * @return {@linkplain String}
	 * @Date: 2021-11-17 11:12:01
	 * @Author: 飞拳
	 */
	public abstract String enter(Player player);
}
