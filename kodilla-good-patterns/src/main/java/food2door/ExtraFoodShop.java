package food2door;

import java.util.LinkedList;
import java.util.List;

public class ExtraFoodShop implements Shop {

    private Product product;
    private List<Product> products;

    @Override
    public String name() {
        return "ExtraFoodShop";
    }

    public String getName(){
        return this.name();
    }

    public ExtraFoodShop(){
        this.products = new LinkedList<>();
    }

    public void addProduct(Product product){
        products.add(new Product("milk","dairy","l"));
        products.add(new Product("bread","breadstuff","kg"));

    }
    @Override
    public void process(Order order) {
        boolean isOrdered = order.isOrdered();


        if (isOrdered) {
            System.out.println(getName());
            System.out.println("Thank you for shopping. You have bought " + order.getQuantity() + " " +
                    order.getProduct().getQuantityUnits() + " of " + order.getProduct().getName());
        } else
            System.out.println("Probably we don't hava this product or storage quantity is not enough");
    }

}
