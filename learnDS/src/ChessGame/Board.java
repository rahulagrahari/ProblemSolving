package ChessGame;

import ChessGame.Pieces.*;

public class Board {
    private Box[][] board;
    private static Board single_instance = null;
    private Board(){

        this.initBoard();
    }

    public static Board getInstance(){
        if (single_instance == null){
            single_instance = new Board();
        }
        return single_instance;
    }

    private void initBoard() {
        board = new Box[8][8];
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                board[i][j] = new Box(i, j, null);
            }
        }
        // placing the white pieces on the board
        board[0][0].setPiece(new Rook(true));
        board[0][7].setPiece(new Rook(true));
        board[0][1].setPiece(new Knight(true));
        board[0][6].setPiece(new Knight(true));
        board[0][2].setPiece(new Bishop(true));
        board[0][5].setPiece(new Bishop(true));
        board[0][3].setPiece(new King(true));
        board[0][4].setPiece(new Queen(true));

        for(int i=0; i<8; i++){
            board[1][i].setPiece(new Pawn(true));
        }

        // placing the black pieces on the board
        board[7][0].setPiece(new Rook(false));
        board[7][7].setPiece(new Rook(false));
        board[7][1].setPiece(new Knight(false));
        board[7][6].setPiece(new Knight(false));
        board[7][2].setPiece(new Bishop(false));
        board[7][5].setPiece(new Bishop(false));
        board[7][3].setPiece(new King(false));
        board[7][4].setPiece(new Queen(false));

        for(int i=0; i<8; i++){
            board[6][i].setPiece(new Pawn(false));
        }
    }

    public Box[][] getBoard() {
        return board;
    }

}
