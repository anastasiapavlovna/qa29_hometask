package lesson7.impl;

import lesson7.Domain.Order;

public interface Delivery {

    void deliveryHome(Order order);

    default void deliveryWindow(Order order) {
        System.out.println("Window pick-up");
    }
}
