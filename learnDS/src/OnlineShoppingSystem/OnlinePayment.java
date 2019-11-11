package OnlineShoppingSystem;

public class OnlinePayment implements Payment {
    private int amountToPay;

    public OnlinePayment(int amountToPay){
        this.amountToPay =amountToPay;
    }

    @Override
    public int getAmountToPay() {
        return amountToPay;
    }

    @Override
    public void setAmountToPay(int amount) {
        this.amountToPay = amount;
    }

    @Override
    public boolean pay() {
        return true;
    }
}
