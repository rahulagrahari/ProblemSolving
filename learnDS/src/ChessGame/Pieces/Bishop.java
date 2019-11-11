package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Box;
import ChessGame.Move.Move;
import ChessGame.Move.Diagonal;


public class Bishop extends Piece{

    private String symbol = "|_B_|";
    public Bishop(boolean is_white){

        super(is_white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {

        Move diagonalMove = new Diagonal();
        boolean canMoveDiagonal = diagonalMove.moveRule(start, end);
        if (canMoveDiagonal){
            if(end.getPiece() == null){
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
