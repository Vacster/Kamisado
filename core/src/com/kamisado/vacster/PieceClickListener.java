package com.kamisado.vacster;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class PieceClickListener extends ClickListener
{

	private Board board;
	private Piece piece;
	
	public PieceClickListener(Board board, Piece piece)
	{
		this.board = board;
		this.piece = piece;
	}
	
	@Override
	public void clicked(InputEvent event, float x, float y)
	{
		Gdx.app.log("Piece", piece.getPieceColor().getName() + " clicked");
		if(board.selectedPiece == null)
			board.handlePiece(piece);
		super.clicked(event, x, y);
	}
}
