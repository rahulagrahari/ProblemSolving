package ChessGame.Move;

import ChessGame.Box;

import java.util.Map;

public class Vertical implements Move{
    private int max_step = 8;
    private boolean moveOnlyForward = false;

    public Vertical() {
    }

    public Vertical(int max_step) {
        this.max_step = max_step;
    }

    public Vertical(int max_step, boolean moveOnlyForward) {
        this.max_step = max_step;
        this.moveOnlyForward = moveOnlyForward;
    }

    @Override
    public boolean moveRule(Box box1, Box box2) {
        Map coord = GetCoordinates.getCoord(box1, box2);

        if(moveOnlyForward){
            if (box1.getPiece().is_white){
                if ((int)coord.get("X1") > (int)coord.get("X2")) return false;
            }
            else{
                if ((int)coord.get("X1") < (int)coord.get("X2")) return false;
            }
        }

        int DiffX = Math.abs((int)coord.get("X1") - (int)coord.get("X2"));
        int DiffY = Math.abs((int)coord.get("Y1") - (int)coord.get("Y2"));
        if (DiffX <= max_step && DiffY == 0){
            return PathClearance.isPathClear(box1, box2);
        }
        return false;
    }
}
