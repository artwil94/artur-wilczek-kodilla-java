package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductSaleService implements OrderService {

    @Override
    public boolean sell(final User user,final LocalDateTime data) {
        System.out.println("Selling product for:" + user.getName());
        return true;
    }
}
