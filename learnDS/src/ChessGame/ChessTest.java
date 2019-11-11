package ChessGame;

import ChessGame.Pieces.Piece;

import java.util.Scanner;

public class ChessTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first player name ");
        String name1 = s.nextLine();

        System.out.println("Enter second player name ");
        String name2 = s.nextLine();
        Player player1 = new Player(true, name1);
        Player player2 = new Player(false, name2);

        Game chess = new Game(player1, player2);
        chess.setCurrent_player(player1);
        Piece whiteKing = chess.board.getBoard()[0][3].getPiece();
        Piece blackKing = chess.board.getBoard()[7][3].getPiece();
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        chess.displayBoard();
        while((!whiteKing.getIs_killed()) && (!blackKing.getIs_killed())){

            Player p = chess.getCurrent_player();
            System.out.println(p.getName()+"'s turn");
            System.out.println("box1 x location");
            x1=s.nextInt();
            System.out.println("box1 y location");
            y1=s.nextInt();
            System.out.println("box2 x location");
            x2=s.nextInt();
            System.out.println("box2 y location");
            y2=s.nextInt();
            Box end = chess.board.getBoard()[x2][y2];
            Box start = chess.board.getBoard()[x1][y1];
            boolean res = chess.movePiece(start, end);
            if (res){
                chess.player_turn(chess.getCurrent_player());
            }
            else{
                System.out.println("move not allowed play again!");
            }
            chess.displayBoard();

        }

        if (whiteKing.getIs_killed()){
            System.out.println(player2.getName()+": black is the winner");
        }
        else{
            System.out.println(player1.getName()+": white is the winner");
        }

    }
}
