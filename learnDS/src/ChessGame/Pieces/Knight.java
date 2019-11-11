package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Box;
import ChessGame.Move.Move;
import ChessGame.Move.TwoAndHalf;

public class Knight extends Piece{

    private final String symbol = "|_H_|";
    public Knight(boolean is_white){
        super(is_white);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        Move twoAndHalf = new TwoAndHalf();
        boolean canMoveTwoAndHalf = twoAndHalf.moveRule(start, end);
        if (canMoveTwoAndHalf){
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
