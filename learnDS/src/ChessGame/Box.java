package ChessGame;

import ChessGame.Pieces.Piece;

public class Box {
    private int x;
    private int y;
    private Piece piece;

    public Box(int x, int y, Piece piece){

        this.x = x;
        this.y = y;
        this.piece = piece;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {

        this.piece = piece;
    }

    public boolean equals(Object obj){

        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        }
        else if (obj instanceof Box) {
            Box b = (Box) obj;
            if (b.getX() == this.getX() && b.getY() == this.getY()) {
                return true;
            }
        }
        return false;

    }
}
