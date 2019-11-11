package OnlineShoppingSystem;

public class Product {

    private int productId;
    private String productName;
    private int productPrice;
    private String productDescription;
    private int productAvailableQuantity;

    public Product(int productId, String productName, int productPrice, String productDescription, int productAvailableQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productAvailableQuantity = productAvailableQuantity;
    }

    // getters and setters //

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductAvailableQuantity() {
        return productAvailableQuantity;
    }

    public void setProductAvailableQuantity(int productAvailableQuantity) {
        this.productAvailableQuantity = productAvailableQuantity;
    }
}
