package ChessGame.Move;

import ChessGame.Box;

import java.util.HashMap;
import java.util.Map;

public class GetCoordinates {

    public static Map<String, Integer> getCoord(Box box1, Box box2){
        Map<String, Integer> m = new HashMap<>();
        m.put("X1", box1.getX());
        m.put("X2", box2.getX());
        m.put("Y1", box1.getY());
        m.put("Y2", box2.getY());
        return m;
    }
}
