package food2door;

public interface FoodProducer {

    boolean process(Product product, int orderQuantity);

    Product getProduct();
}
