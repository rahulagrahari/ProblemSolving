package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Box;
import ChessGame.Move.Diagonal;
import ChessGame.Move.Move;
import ChessGame.Move.Vertical;

public class Pawn extends Piece {

    private final String symbol = "|_p_|";
    public Pawn(boolean is_white){
        super(is_white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        Move verticalMove = new Vertical(1, true);
        Move diagonalMove = new Diagonal(1, true);

        boolean canMoveDiagonal = diagonalMove.moveRule(start, end);
        boolean canMoveVertical = verticalMove.moveRule(start, end);

        if(canMoveDiagonal){
            if (end.getPiece() == null){
                return false;
            }
            if (end.getPiece().is_white != this.is_white){
                end.getPiece().setIs_killed(true);
                end.setPiece(this);
                return true;
            }

        }
        if (canMoveVertical){
            if (end.getPiece() == null) {
                end.setPiece(this);
                return true;
            }
        }
        return false;
    }
    @Override
    public String getSymbol() {
        return symbol;
    }
}
