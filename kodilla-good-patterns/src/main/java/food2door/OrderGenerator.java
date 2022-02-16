package food2door;

import java.util.*;

public class OrderGenerator {

    public Order order;
    public Purchaser purchaser;
    public Product product;
    public int quantity;
    public Shop shop;
    public String producer;
    public boolean isOrdered;


    private Map<String,Shop> listOfProducer = new HashMap<>();
    
    private List<String> producers = new ArrayList<>();
    
    public void addProducers(){
        producers.add("ExtraFoodShop");
        producers.add("HealthyShop");
        producers.add("GlutenFreeShop");
    }

    Random random = new Random();

    public Order generateOrder() {
        product = new Product("Milk","Dairy","l");
        purchaser = new Purchaser("Artur","Wil","Warszawska");
        producer = producers.get(random.nextInt(producers.size()));


        if(producer == "ExtraFoodShop"){
            shop = new ExtraFoodShop();
        }else if
        (producer == "HealthyShop" ){
                shop = new HealthyShop();
            }else {
                shop = new GlutenFreeShop();
            }
        
        quantity = random.nextInt(10);
        isOrdered = random.nextBoolean();

        return new Order(purchaser, product, quantity, shop,producer,isOrdered);
        }

}
