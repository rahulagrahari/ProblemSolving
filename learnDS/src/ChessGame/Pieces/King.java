package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Box;
import ChessGame.Move.Diagonal;
import ChessGame.Move.Horizontal;
import ChessGame.Move.Move;
import ChessGame.Move.Vertical;

public class King extends Piece {

    private String symbol = "|_K_|";
    public King(boolean is_white){
        super(is_white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        Move verticalMove = new Vertical(1);
        Move horizontalMove = new Horizontal(1);
        Move diagonalMove = new Diagonal(1);

        boolean canMoveDiagonal = diagonalMove.moveRule(start, end);
        boolean canMoveVertical = verticalMove.moveRule(start, end);
        boolean canMoveHorizontal = horizontalMove.moveRule(start, end);
        if (canMoveDiagonal || canMoveHorizontal || canMoveVertical){
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
