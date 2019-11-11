package ChessGame.Move;

import ChessGame.Board;
import ChessGame.Box;

import java.util.Map;

class PathClearance {

    static boolean isPathClear(Box start, Box end){

        if (start.equals(end)){
            return true;
        }

        Box nxt_box = getNextBox(start, end);

        if (nxt_box != null){
            if (nxt_box.equals(end)){
                return true;
            }

            if (nxt_box.getPiece() == null){
                return isPathClear(nxt_box, end);
            }

        }
        return false;
        }

        private static Box getNextBox(Box start, Box end){
            Board board = Board.getInstance();
            Box[][] b = board.getBoard();
            Map coord = GetCoordinates.getCoord(start, end);
            Box nxt_box = null;
            // condition for moving in vertical direction
            if ((int)coord.get("Y1") == (int)coord.get("Y2")){

                if ((int)coord.get("X1")<(int)coord.get("X2")){
                    nxt_box = b[(int)coord.get("X1") + 1][(int)coord.get("Y1")];}
                else{
                    nxt_box = b[(int)coord.get("X1") - 1][(int)coord.get("Y1")];
                }


            }
            // condition for moving in horizontal direction
            if ((int)coord.get("X1") == (int)coord.get("X2")){

                if ((int)coord.get("Y1")<(int)coord.get("Y2")){
                    nxt_box = b[(int)coord.get("X1")][(int)coord.get("Y1") + 1];}
                else{
                    nxt_box = b[(int)coord.get("X1")][(int)coord.get("Y1") - 1];;
                }

            }
            // condition for moving in diagonal direction
            if (Math.abs((int)coord.get("X1")-(int)coord.get("X2")) == Math.abs((int)coord.get("Y1")-(int)coord.get("Y2")))
            {

                if ((int)coord.get("X1") < (int)coord.get("X2") && (int)coord.get("Y1") < (int)coord.get("Y2")){
                    nxt_box = b[(int)coord.get("X1") + 1][(int)coord.get("Y1") + 1];
                }
                else if((int)coord.get("X1") < (int)coord.get("X2") && (int)coord.get("Y1") > (int)coord.get("Y2")) {
                    nxt_box = b[(int)coord.get("X1") + 1][(int)coord.get("Y1") - 1];
                }
                else if((int)coord.get("X1") > (int)coord.get("X2") && (int)coord.get("Y1") < (int)coord.get("Y2")) {
                    nxt_box = b[(int)coord.get("X1") - 1][(int)coord.get("Y1") +1];
                }
                else{
                    nxt_box = b[(int)coord.get("X1") - 1][(int)coord.get("Y1") - 1];
                }

            }
            return nxt_box;
        }

}
