package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	// classe virou abstrata por causa dos metodos abstratos em Piece
	private Color color;
	private int countMove;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public void increaseMoveCount() {
		countMove ++;
	}
	
	public void decreaseMoveCount() {
		countMove --;
	}
	
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
		
	}
	
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
