package boardgame;

public class Piece {
	
	
	protected Position position;
	private Board board;
	
	public Piece (Board board) {
		this.board = board;
		position = null; //N�o � necess�rio declarar position como nulo pq � gerado automaticamente
						//como nulo na cria��o caso n receba nada
	}

	protected Board getBoard() {
		return board;
	}


}
