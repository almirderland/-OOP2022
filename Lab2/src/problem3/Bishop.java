package problem3;
//слон
public class Bishop extends Piece {
	 public Bishop(Position pos1) {
	        this.pos1 = pos1;
	    }

	    public boolean isLegalMove(Position pos2) {
	        return Piece.isLegalMove(this.pos1, pos2) && Bishop.isLegalMove(this.pos1, pos2);
	    }

	    public static boolean isLegalMove(Position pos1, Position pos2) {
	        if (Math.abs(pos1.letter - pos2.letter) == Math.abs(pos1.num - pos2.num)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
