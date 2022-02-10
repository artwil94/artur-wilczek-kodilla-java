package food2door;

public class OrderRetriever {

    private ExtraFoodShop extraFoodShop;
    private HealthyShop healthyShop;
    private GlutenFreeShop glutenFreeShop;

    public OrderRetriever() {
        this.extraFoodShop = new ExtraFoodShop();
        this.healthyShop = new HealthyShop();
        this.glutenFreeShop = new GlutenFreeShop();
    }
}
