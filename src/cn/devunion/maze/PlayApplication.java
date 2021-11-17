package cn.devunion.maze;

/**
 * <p>Description: 体验</p>
 * <p>@Date: 2021-11-17 16:05:04</p>
 * <p>@Author: 飞拳</p>
 */
public class PlayApplication {

	public static void main(String[] args) {
		MazeGame mazeGame = new MazeGame();
		Player player = new Player(mazeGame, 0, Direction.EAST);
		player.go(Direction.EAST);
		player.go(Direction.EAST);
		player.go(null);
		player.go(Direction.SOUTH);
		player.go(Direction.WEST);
		player.go( Direction.NORTH);
		player.go(Direction.WEST);
	}
}
