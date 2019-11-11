package ChessGame;

public class Player {
    public boolean is_white;
    private boolean is_winner = false;
    private String name;

    public Player(boolean is_white, String name){

        this.is_white = is_white;
        this.name = name;
    }

    public boolean isIs_white() {
        return is_white;
    }

    public void setIs_white(boolean is_white) {
        this.is_white = is_white;
    }

    public boolean isIs_winner() {
        return is_winner;
    }

    public void setIs_winner(boolean is_winner) {
        this.is_winner = is_winner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
