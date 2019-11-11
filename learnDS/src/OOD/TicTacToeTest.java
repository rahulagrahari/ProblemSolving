package OOD;

import java.util.List;
import java.util.Scanner;

class TicTacToeTest{

    public static void main(String[ ] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first player name ");
        String name1 = s.nextLine();

        System.out.println("Enter second player name ");
        String name2 = s.nextLine();

        Player player1 = new Player(1, name1);
        Player player2 = new Player(-1, name2);
        Player[] p = {player1, player2};
        Game t = new Game(p, 3);
        t.Start();
        int x, y;
        do
        {
            System.out.println(t.getPlayer().getSign()==player1.getSign()?"Player "+player1.getName()+" turn":"Player "+player2.getName()+" turn");
            System.out.println("Enter x and y places");
            x=s.nextInt();
            y=s.nextInt();
            t.makeMove(x, y);
            t.displayGameBoard();
            System.out.println("_____________________________");
            t.displayWinner();

        }while(t.isEmpty());

        List<Move> m1 = t.getMoves(player1);
        List<Move> m2 = t.getMoves(player1);
        for (Move m : m1){
            System.out.println(player1.getName()+" "+m.getI()+", "+m.getJ());
        }

    }
}
