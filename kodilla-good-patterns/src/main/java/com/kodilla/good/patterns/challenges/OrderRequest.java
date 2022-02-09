package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime data;

    public OrderRequest(final User user, final LocalDateTime data) {
        this.user = user;
        this.data = data;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getData() {
        return data;
    }
}
