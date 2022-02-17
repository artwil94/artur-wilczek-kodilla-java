package food2door;

import java.util.*;

public class OrderGenerator {

    private Map<String,Shop> listOfProducer = new HashMap<>();
    
    private List<String> producers = new ArrayList<>();
    
    public void addProducers(){
        producers.add("ExtraFoodShop");
        producers.add("HealthyShop");
        producers.add("GlutenFreeShop");
    }

    Random random = new Random();

    public Order generateOrder() {
       Product product = new Product("Milk","Dairy","l");
       Purchaser purchaser = new Purchaser("Artur","Wil","Warszawska");



        int quantity = random.nextInt(10);
        boolean isOrdered = random.nextBoolean();

        return new Order(purchaser, product, quantity,isOrdered);
        }

}
