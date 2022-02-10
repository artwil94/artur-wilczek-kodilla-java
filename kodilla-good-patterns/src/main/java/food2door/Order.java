package food2door;

public class Order {

    private Purchaser purchaser;
    private FoodProducer foodProducer;
    private Product product;
    private int quantity;
    private String orderID;

    public Order(Purchaser purchaser, FoodProducer foodProducer, Product product, int quantity, String orderID) {
        this.purchaser = purchaser;
        this.foodProducer = foodProducer;
        this.product = product;
        this.quantity = quantity;
        this.orderID = orderID;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrderID() {
        return orderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (quantity != order.quantity) return false;
        if (purchaser != null ? !purchaser.equals(order.purchaser) : order.purchaser != null) return false;
        if (foodProducer != null ? !foodProducer.equals(order.foodProducer) : order.foodProducer != null) return false;
        if (product != null ? !product.equals(order.product) : order.product != null) return false;
        return orderID != null ? orderID.equals(order.orderID) : order.orderID == null;
    }

    @Override
    public int hashCode() {
        int result = purchaser != null ? purchaser.hashCode() : 0;
        result = 31 * result + (foodProducer != null ? foodProducer.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + (orderID != null ? orderID.hashCode() : 0);
        return result;
    }
}
