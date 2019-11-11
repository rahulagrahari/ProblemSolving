package OOD;

class Player{

    private int sign;
    private String name;

    public Player(int sign, String name){
        this.name = name;
        this.sign = sign;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
