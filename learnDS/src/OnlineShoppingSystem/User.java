package OnlineShoppingSystem;

import java.util.List;

public class User {
    int userId;
    String userName;
    String Password;
    Address address;
    String email;
    String mobile;
    List<CreditCard> creditCardList;

    public User(int userId, String userName, String password, Address address, String email, String mobile) {
        this.userId = userId;
        this.userName = userName;
        Password = password;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
    }
}
