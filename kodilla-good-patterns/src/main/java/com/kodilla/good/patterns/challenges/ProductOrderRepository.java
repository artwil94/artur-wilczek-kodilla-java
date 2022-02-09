package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public boolean createOrder(final User user,final LocalDateTime data) {
        System.out.println("Product was sold for:" + user.getName() + "time order: " + data.toString());
        return true;
    }
}
