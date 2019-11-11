package OnlineShoppingSystem;

import java.util.List;

public class Cart {
    private int cartId;
    private List<Item> items;

    public Cart(int cartId, List<Item> items) {
        this.cartId = cartId;
        this.items = items;
    }

    public boolean addItemToList(Item item){
        return items.add(item);
    }

    public boolean deleteItemFromList(Item item){
        return items.remove(item);
    }

    public void updateItemQty(Item item, int count){
        item.setQuantity(count);

    }

    public int getTotalCartAmount(){
        return 0;
    }
}
