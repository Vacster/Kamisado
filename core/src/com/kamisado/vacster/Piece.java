package com.kamisado.vacster;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Piece extends Image{

	private Colors color;
	private boolean white;
	
	public Piece(Board board, boolean white, Colors color, short posX, short posY) {
		super(new Texture(Gdx.files.internal((white?"white_":"black_")+color.getName())));//lol
		this.color = color;
		this.white = white;
		setPosition(135*posX,420 + (135*posY));
		setSize(135.0f, 135.0f);
		addListener(new PieceClickListener(board, this));
	}
	
	public Colors getPieceColor()
	{
		return color;
	}
	
	public boolean isWhite()
	{
		return white;
	}
}
