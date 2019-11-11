package ChessGame.Move;

import ChessGame.Box;

import java.util.Map;

public class Horizontal implements Move{
    private int max_step = 8;

    public Horizontal(int max_step) {
        this.max_step = max_step;
    }

    public Horizontal() {
    }

    @Override
    public boolean moveRule(Box box1, Box box2) {
        Map coord = GetCoordinates.getCoord(box1, box2);

        int DiffX = Math.abs((int)coord.get("X1") - (int)coord.get("X2"));
        int DiffY = Math.abs((int)coord.get("Y1") - (int)coord.get("Y2"));
        if (DiffX == 0 && DiffY <= max_step){
            return PathClearance.isPathClear(box1, box2);
        }
        return false;
    }
}
