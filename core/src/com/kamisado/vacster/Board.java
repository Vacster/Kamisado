package com.kamisado.vacster;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import static com.kamisado.vacster.Colors.*;

public class Board extends Image{

	private static final boolean WHITE = true, BLACK = false;
	private static final Colors colors[][] = {//Other DS?
			{BROWN, GREEN, RED, YELLOW, PINK, CYAN, BLUE, ORANGE},
			{CYAN, BROWN, YELLOW, BLUE, GREEN, PINK, ORANGE, RED},
			{BLUE, YELLOW, BROWN, CYAN, RED, ORANGE, PINK, GREEN},
			{YELLOW, RED, GREEN, BROWN, ORANGE, BLUE, CYAN, PINK},
			{PINK, CYAN, BLUE, ORANGE, BROWN, GREEN, RED, YELLOW},
			{GREEN, PINK, ORANGE, RED, CYAN, BROWN, YELLOW, BLUE},
			{RED, ORANGE, PINK, GREEN, BLUE, YELLOW, BROWN, CYAN},
			{ORANGE, BLUE, CYAN, PINK, YELLOW, RED, GREEN, BROWN}
		};

	private boolean turn = BLACK;
	private Stage stage;
	private Piece pieces[][] = new Piece[8][8];
	private Colors currentColor = null;
	
	public Piece selectedPiece = null;
	
	public Board(Stage stage) 
	{
		super(new Texture(Gdx.files.internal("board.png")));
		this.stage = stage;
		this.stage.addActor(this);
		addPieces();
	}
	
	private void addPieces()
	{
		for(short x = 0; x < 8; x++)
		{
			pieces[x][0] = new Piece(this, false, colors[0][x], x, (short) 0);
			pieces[x][7] = new Piece(this, true	, colors[7][x], x, (short) 7);
			stage.addActor(pieces[x][0]);
			stage.addActor(pieces[x][7]);
		}
	}

	public boolean isTurn()
	{
		return turn;
	}
	
	public void handlePiece(Piece piece)
	{
		if(!piece.isWhite() && currentColor == null)
		{
			selectedPiece = piece;
			Gdx.app.log("Board", "Selected First");
		}
	}
}
