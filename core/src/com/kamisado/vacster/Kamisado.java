package com.kamisado.vacster;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class Kamisado extends ApplicationAdapter {
	
	Stage gameStage;
	
	@Override
	public void create () {
		gameStage = new Stage(new FitViewport(1080, 1920));
		Board board = new Board(gameStage);
		
		Gdx.input.setInputProcessor(gameStage);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameStage.draw();
	}
}
