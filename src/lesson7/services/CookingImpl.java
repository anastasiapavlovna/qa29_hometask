package lesson7.services;

import lesson7.Domain.Order;
import lesson7.impl.Cooking;

public class CookingImpl implements Cooking {

    public void cookOrder(Order order) {
        System.out.println("Cooking in Process");

    }
}
