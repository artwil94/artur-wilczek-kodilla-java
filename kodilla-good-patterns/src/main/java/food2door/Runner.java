package food2door;

import java.util.List;

public class Runner {
    public static void main(String[] args) {


        OrderGenerator generator = new OrderGenerator();
        generator.addProducers();
        Order randomOrder = generator.generateOrder();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(randomOrder,new ExtraFoodShop());
    }
}