package OnlineShoppingSystem;

import java.util.Date;

public class CreditCard {

    private int creditCardNumber;
    private Date expiryDate;
    private String CardHolderName;

    public CreditCard(int creditCardNumber, Date expiryDate, String cardHolderName) {
        this.creditCardNumber = creditCardNumber;
        this.expiryDate = expiryDate;
        CardHolderName = cardHolderName;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        CardHolderName = cardHolderName;
    }
}
