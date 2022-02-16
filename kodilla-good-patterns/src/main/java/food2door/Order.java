package food2door;

public class Order {

    private Purchaser purchaser;
    private Product product;
    private int quantity;
    private Shop shop;
    private String producer;
    private boolean isOrdered;

    public Order(Purchaser purchaser, Product product, int quantity, Shop shop, String producer, boolean isOrdered) {
        this.purchaser = purchaser;
        this.product = product;
        this.quantity = quantity;
        this.shop = shop;
        this.producer = producer;
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

    public Shop getShop() {
        return shop;
    }

    public String getProducer() {
        return producer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (quantity != order.quantity) return false;
        if (isOrdered != order.isOrdered) return false;
        if (purchaser != null ? !purchaser.equals(order.purchaser) : order.purchaser != null) return false;
        if (product != null ? !product.equals(order.product) : order.product != null) return false;
        if (shop != null ? !shop.equals(order.shop) : order.shop != null) return false;
        return producer != null ? producer.equals(order.producer) : order.producer == null;
    }

    @Override
    public int hashCode() {
        int result = purchaser != null ? purchaser.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + (shop != null ? shop.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (isOrdered ? 1 : 0);
        return result;
    }
}


