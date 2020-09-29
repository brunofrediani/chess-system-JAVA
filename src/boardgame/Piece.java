package boardgame;

public class Piece {
	
	
	protected Position position;
	private Board board;
	
	public Piece (Board board) {
		this.board = board;
		position = null; //Não é necessário declarar position como nulo pq é gerado automaticamente
						//como nulo na criação caso n receba nada
	}

	protected Board getBoard() {
		return board;
	}


}
