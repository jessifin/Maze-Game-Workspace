package me.jesseking.maze_game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import me.jesseking.maze_game.screen.GameScreen;
import me.jesseking.maze_game.screen.MainMenuScreen;

public class MazeGame extends Game {

	private GameScreen gameScreen;
	private MainMenuScreen menuScreen;
	
	public SpriteBatch batch;

	
	@Override
	public void create() {
		batch = new SpriteBatch();
		gameScreen = new GameScreen(this);
		menuScreen = new MainMenuScreen(this);
		
		this.setScreen(menuScreen);
	}

	@Override
	public void render() {
		super.render();
	}
	
	@Override
	public void dispose() {
		
	}
}
