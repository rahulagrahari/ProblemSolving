package OnlineShoppingSystem;

public interface Payment {

    int getAmountToPay();
    void setAmountToPay(int amount);
    boolean pay();


}
