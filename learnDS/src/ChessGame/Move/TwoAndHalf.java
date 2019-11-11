package ChessGame.Move;

import ChessGame.Box;

import java.util.Map;

public class TwoAndHalf implements Move{


    @Override
    public boolean moveRule(Box box1, Box box2) {
        Map coord = GetCoordinates.getCoord(box1, box2);

        int DiffX = Math.abs((int)coord.get("X1") - (int)coord.get("X2"));
        int DiffY = Math.abs((int)coord.get("Y1") - (int)coord.get("Y2"));

        return DiffX-DiffY==1;
    }
}
