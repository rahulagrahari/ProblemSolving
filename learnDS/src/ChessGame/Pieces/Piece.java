package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Box;

public abstract class Piece {

    public boolean is_white;
    private boolean is_killed = false;

    public Piece(boolean is_white){

        this.is_white = is_white;
    }

    public boolean getIs_killed() {

        return is_killed;
    }

    public void setIs_killed(boolean is_killed) {
        this.is_killed = is_killed;
    }

    public abstract boolean canMove(Board board, Box start, Box end);


    public abstract String getSymbol();
}
