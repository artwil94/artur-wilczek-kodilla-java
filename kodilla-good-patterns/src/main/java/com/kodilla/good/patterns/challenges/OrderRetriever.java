package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRetriever {

    public OrderRequest retrieve() {
        User user = new User ("Artur","abcabc");

        LocalDateTime data = LocalDateTime.of(2022,1,1,12,0,0);

        return new OrderRequest(user,data);
    }
}
