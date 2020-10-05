package chess;

import boardgame.Position;

public class ChessPosition {
		private int row;
		private char column;
	
		public ChessPosition(char column, int row) {
			if (column < 'a' || column > 'h' || row < 1 || row > 8) {
	// pode usar comparador de > ou < para letras do alfabeto também (sendo A a primeira e Z a última)
				throw new ChessException("Erro instanciando ChessPosition: Os valores válidos devem estar entre a1 e h8 ");
			}
			this.row = row;
			this.column = column;
		}
		public int getRow() {
			return row;
		}
		public char getColumn() {
			return column;
		}	
		
		protected Position toPosition() {
			return new Position(8 - row, column - 'a');
		}
		protected static ChessPosition fromPosition(Position position) {
			return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
		}
		
		public String toString() {
			return ""+ column + row;
			// "" é colocado para forçar o compilador concatenar os dois strings
		}
		
	}
