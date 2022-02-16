package food2door;

import java.util.LinkedList;
import java.util.List;

public class HealthyShop implements Shop {

    private Product product;
    private List<Product> healthyProducts;

    @Override
    public String name() {
        return "HealthyShop";
    }

    public String getName(){
        return this.name();
    }

    public HealthyShop(){
        this.healthyProducts = new LinkedList<>();
    }

    public void addHealthyProduct(Product product){
        healthyProducts.add(new Product("milk","dairy","l"));
        healthyProducts.add(new Product("bread","breadstuff","kg"));

    }

    @Override
    public void process(Order order) {
        boolean isOrdered = order.isOrdered();


        if (isOrdered) {
            System.out.println(getName());
            System.out.println("Thank you for shopping. You have bought " + order.getQuantity() + " " +
                    order.getProduct().getQuantityUnits() + " of " + order.getProduct().getName());
        } else
            System.out.println("Probably we don't have this product or storage quantity is not enough");
    }


}
