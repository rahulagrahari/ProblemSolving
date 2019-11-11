package OOD;
import java.util.Random;
class TicTacToe
{
    public static final int X = 1, O = -1;
    private static final int EMPTY = 0;
    private int player;
    private int[][] board;
    public boolean isEmpty = false;

    public TicTacToe(){
        player = getRandomPlayerTurn();
        board = new int[3][3];
    }

    /** Puts an X or O mark at position i,j. */
    public void makeMove(Move move)
    {
        int x = move.getI();
        int y = move.getJ();
        if(x<0 || x>2 || y<0 || y>2)
        {
            System.out.println("Invalid board position");
            return;
        }
        if(board[x][y] != EMPTY)
        {
            System.out.println("Board position occupied");
            return;
        }
        board[x][y] = player;   // place the mark for the current player
        player = getNextPlayerTurn(player);       // switch players (uses fact that O = - X)
    }

    public int getPlayer() {
        return player;
    }

    private int getRandomPlayerTurn(){
        Random random = new Random();
        int turn = random.nextInt(2);
        return turn == 0 ? -1 : 1;
    }

    private int getNextPlayerTurn(int player){
        return -player;
    }

    /** Checks whether the board configuration is a win for the given player. */
    public boolean isWin(int player)
    {
        return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
                (board[1][0] + board[1][1] + board[1][2] == player*3) ||
                (board[2][0] + board[2][1] + board[2][2] == player*3) ||
                (board[0][0] + board[1][0] + board[2][0] == player*3) ||
                (board[0][1] + board[1][1] + board[2][1] == player*3) ||
                (board[0][2] + board[1][2] + board[2][2] == player*3) ||
                (board[0][0] + board[1][1] + board[2][2] == player*3) ||
                (board[2][0] + board[1][1] + board[0][2] == player*3));
    }

    /**display the winning player or indicate a tie (or unfinished game).*/
    public void displayWinner(Player player1, Player player2)
    {
        if(isWin(X))
        {
            System.out.println("\n"+ player1.getName() +" wins...!!");
            isEmpty=false;
        }
        else if(isWin(O))
        {
            System.out.println("\n"+ player2.getName() +" wins...!!");
            isEmpty=false;
        }
        else
        {
            if(!isEmpty)
            {
                System.out.println("its a tie");
            }

        }
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder();
        isEmpty = false;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                switch(board[i][j])
                {
                    case X:
                        s.append(" X ");
                        break;
                    case O:
                        s.append(" O ");
                        break;
                    case EMPTY:
                        s.append("   ");
                        isEmpty=true;
                        break;
                }
                if(j<2)
                {
                    s.append("|");
                }

            }
            if(i<2)
            {
                s.append("\n-----------\n");
            }
        }
        return s.toString();
    }
}

