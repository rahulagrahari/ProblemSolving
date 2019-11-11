package OnlineShoppingSystem;


import java.util.Date;

public class Customer {
    private User user;
    private Cart cart;

    public Customer(User user, Cart cart) {
        this.user = user;
        this.cart = cart;
    }

    public boolean addToCart(Item item){
        return cart.addItemToList(item);
    }

    public boolean removeFromCart(Item item){
        return cart.deleteItemFromList(item);
    }

    public Order placeOrder(){
        Date date = new Date();
        Order order = new Order(1, 11, this, date);
        order.makePayment(new OnlinePayment(cart.getTotalCartAmount()));

        return order;
    }
}
