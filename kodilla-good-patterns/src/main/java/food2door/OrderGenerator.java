package food2door;

import java.util.*;

public class OrderGenerator {


    Random random = new Random();

    public Order generateOrder() {
       Product product = new Product("Milk","Dairy","l");
       Purchaser purchaser = new Purchaser("Artur","Wil","Warszawska");



        int quantity = random.nextInt(10);
        boolean isOrdered = random.nextBoolean();

        return new Order(purchaser, product, quantity,isOrdered);
        }

}
