package OnlineShoppingSystem;

import java.util.Date;

public class Order {
    int orderId;
    int orderNumber;
    Customer customer;
    Date orderDate;

    public Order(int orderId, int orderNumber, Customer customer, Date orderDate) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public boolean makePayment(Payment payment){

        return true;
    }
}
