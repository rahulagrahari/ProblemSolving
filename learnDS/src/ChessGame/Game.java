package ChessGame;

import ChessGame.Pieces.Piece;

public class Game {

    private Player[] players = new Player[2];
    private Player current_player;
    public Board board = null;

    public Game(Player player1, Player player2){
        players[0] = player1;
        players[1] = player2;
        init();

    }

    private void init(){

        board = Board.getInstance();
    }

    public void player_turn(Player player){

        Player p = player == players[0] ? players[1] : players [0];
        setCurrent_player(p);

    }

    public Player getCurrent_player() {
        return current_player;
    }

    public void setCurrent_player(Player current_player) {
        this.current_player = current_player;
    }

    public boolean movePiece(Box start, Box end){

        Player plyr = getCurrent_player();
        Piece piece = start.getPiece();
        if (piece == null){
            return false;
        }
        if (! plyr.is_white && piece.is_white){
            return false;
        }
        else{
            boolean can_move = piece.canMove(board, start, end);
            if (!can_move){
                return false;
            }
            else{
                start.setPiece(null);
                return true;

            }
        }

    }

    public void displayBoard(){
        Box[][] b = board.getBoard();
        for (int i=0; i<b.length; i++){
            for (int j=0; j<b.length; j++){
                Box box = b[i][j];
                if (box.getPiece() == null){
                    System.out.print("|___|");
                }
                else{
                    System.out.print(box.getPiece().getSymbol());
                }
            }
            System.out.println();
            System.out.println();
        }
    }


}



