package food2door;

public class Order {

    private Purchaser purchaser;
    private Product product;
    private int quantity;
    private boolean isOrdered;

    public Order(Purchaser purchaser, Product product, int quantity,boolean isOrdered) {
        this.purchaser = purchaser;
        this.product = product;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}


