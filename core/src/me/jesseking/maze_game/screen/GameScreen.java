package me.jesseking.maze_game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import me.jesseking.maze_game.MazeGame;

public class GameScreen implements Screen {

	private MazeGame game;
	Texture img;
	float x,y;
	
	public GameScreen(MazeGame game) {
		this.game = game;
	}
	
	@Override
	public void show() {
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render(float delta) { 
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
				
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			y+=2;
		} if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			x-=2;
		} if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x+=2;
		} if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			y-=2;
		}
		
		game.batch.begin();
		game.batch.draw(img, x,y);
		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void dispose() {
		game.batch.dispose();
		img.dispose();
	}


}
