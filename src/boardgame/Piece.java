package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // N�o � necess�rio declarar position como nulo pq � gerado automaticamente
							// como nulo na cria��o caso n receba nada
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	// por ser abstrato a classe Piece teve que virar abstrata tamb�m
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	// classe concreta utilizando uma classe abstrata (possibleMoves) � conhecido como hook
	}
	
	public boolean isThereAnyPossibleMove() {   //concreto dependendo de classe abstrato assim como possibleMove
		boolean[][] mat = possibleMoves();
			for (int i = 0 ; i < mat.length; i++) {
				for (int j =0 ; j < mat.length ; j++) {
					if (mat[i][j]) {
						return true;
					}
				}
			}
		return false;
	}

}
