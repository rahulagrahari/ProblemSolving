package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Box;
import ChessGame.Move.Horizontal;
import ChessGame.Move.Move;
import ChessGame.Move.Vertical;

public class Rook extends Piece {
    private final String symbol = "|_R_|";
    public Rook(boolean is_white){

        super(is_white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        Move verticalMove = new Vertical();
        Move horizontalMove = new Horizontal();
        boolean canMoveVertical = verticalMove.moveRule(start, end);
        boolean canMoveHorizontal = horizontalMove.moveRule(start, end);
        if (canMoveVertical || canMoveHorizontal){
            if (end.getPiece() == null){
                end.setPiece(this);
                return true;
            }
            else if (end.getPiece().is_white != this.is_white){
                end.getPiece().setIs_killed(true);
                end.setPiece(this);
                return true;
            }
            else return false;
        }
        return false;
    }
    @Override
    public String getSymbol() {
        return symbol;
    }
}
