package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // Não é necessário declarar position como nulo pq é gerado automaticamente
							// como nulo na criação caso n receba nada
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	// por ser abstrato a classe Piece teve que virar abstrata também
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	// classe concreta utilizando uma classe abstrata (possibleMoves) é conhecido como hook
	}
	
	public boolean isThereAnyPossibleMove() {   //concreto dependendo de abstrato assim como possibleMove
		boolean [][] mat = possibleMoves();
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
