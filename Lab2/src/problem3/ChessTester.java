package problem3;

public class ChessTester {
    public static void main(String[] args) {
        Pawn pawn = new Pawn(new Position('e', '2'));
        Bishop b = new Bishop(new Position('c', '1'));
        System.out.println(pawn.isLegalMove(new Position('e', '4')));
        System.out.println(b.isLegalMove(new Position('e', '3')));
        System.out.println(Rook.isLegalMove(new Position(5, 5), new Position(4, 8)));
    }
}