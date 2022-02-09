package com.kodilla.good.patterns.challenges;

public class OrderMain {

    public static void main(String[] args) {
       OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();

        ProductOrderService orderProcessor = new ProductOrderService(
                new MailService(), new ProductSaleService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }

}