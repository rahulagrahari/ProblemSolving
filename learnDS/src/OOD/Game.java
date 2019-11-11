package OOD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private Player[] players;
    private int size;
    private TicTacToe ticTacToe;
    private Map<Player, List<Move>> moves;

    public Game(Player[] players, int size){
        this.players = players;
        this.size = size;
    }

    public void Start(){
        ticTacToe = new TicTacToe();
        moves = new HashMap<>();
    }

    public void makeMove(int x, int y){
        Move move = new Move(x, y);
        Player player = getPlayer();

        if (moves.containsKey(player)){
            moves.get(player).add(new Move(x, y));
        }
        else{
            List <Move> mv = new ArrayList<>();
            mv.add(new Move(x, y));
            moves.put(player, mv);
        }

        ticTacToe.makeMove(move);

    }

    Player getPlayer(){
        Player player = null;
        int sign = ticTacToe.getPlayer();

        for (Player p : players){
            if (p.getSign() == sign){
                player = p;
            }

        }
        return player;
    }
    void displayWinner(){
        ticTacToe.displayWinner(players[0], players[1]);
    }

    boolean isEmpty(){
        return ticTacToe.isEmpty;
    }

    List<Move> getMoves(Player player){

        if(moves.containsKey(player)){
            return moves.get(player);
        }
        return null;
    }

    void displayGameBoard(){
        System.out.println(ticTacToe.toString());
    }
}
